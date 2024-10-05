import "./TodoApp.css"
import {BrowserRouter, Routes, Route, useNavigate, useParams, Link} from "react-router-dom";
import React, {useState} from "react";

export default function TodoApp(){
    return (
        <div className="TodoApp">
            <HeaderComponent></HeaderComponent>

            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<LoginComponent/>}/>
                    <Route path="/login" element={<LoginComponent/>}/>
                    <Route path="/welcome/:username" element={<WelcomeComponent/>}/>
                    <Route path="todos" element={<ListTodoComponent/>}/>
                    <Route path="logout" element={<LogoutComponent/>}/>

                    <Route path="*" element={<ErrorComponent/>}/>
                </Routes>
            </BrowserRouter>

            <FooterComponent></FooterComponent>
            {/*<LoginComponent></LoginComponent>*/}
            {/*<WelcomeComponent></WelcomeComponent>*/}
        </div>
    )
}

function LoginComponent(){

    const [userName, setUserName] = useState("Bao")
    const [password, setPassword] = useState("Password")

    const [success, setSuccess] = useState(false)
    const [failed, setFailed] = useState(false)

    const navigate = useNavigate()

    function HandleUsernameChanged(event) {
        setUserName(event.target.value)
    }

    function HandlePasswordChanged(event) {
        setPassword(event.target.value)
    }

    function LoginAuthentication(){
        if(userName==="Bao" && password==="Password"){
            setSuccess(true)
            setFailed(false)
            navigate(`/welcome/${userName}`) // javascript adding variable, use tick ` and ${var}
        } else {
            setSuccess(false)
            setFailed(true)
        }
    }

    function ReturnLoginAttempt() {
        if (success) {
            return (
                <div>
                    Login Successfully!
                </div>
            )
        }
        if (failed) {
            return (
                <div>
                    Login Failed!
                </div>
            )
        }
    }


    return  (
        <div className="Login">
            <h2>Please Login</h2>
            <div className="LoginForm">
                <div>
                    <label htmlFor="">User Name: </label>
                    <input type="text" name="username" value={userName} onChange={HandleUsernameChanged}/>
                </div>
                <div>
                    <label htmlFor="">Password:</label>
                    <input type="password" name="password" value={password} onChange={HandlePasswordChanged}/>
                </div>
                <div>
                    <button type="button" name = "login" onClick={LoginAuthentication}>Login</button>
                </div>
            </div>
            <ReturnLoginAttempt></ReturnLoginAttempt>
        </div>
    )
}

function WelcomeComponent(){
    // const params = useParams()
    // params.username - Also works
    const {username} = useParams()

    return  (
        <div className="Welcome">
            <h1>Welcome! {username}</h1>
            <h2>Your <Link to="/todos">todos</Link>
            </h2>
        </div>
    )
}

function ErrorComponent(){
    return  (
        <div className="Error">
            <h1>Error!</h1>
            Wrong Page
        </div>
    )
}

function ListTodoComponent(){

    const today = new Date()
    const TargetDate = new Date(today.getFullYear()+12, today.getMonth(), today.getDate())

    const todos = [
        {id: 1, description: "Learn how to do a backflip", done: false, targetedDate: TargetDate},
        {id: 2, description: "Learn to read", done: false, targetedDate: TargetDate},
        {id: 3, description: "Learn to write", done: false, targetedDate: TargetDate},

    ]

    return  (
        <div className="container">
            <h1>My Todo List</h1>
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <td>Id:</td>
                            <td>Description:</td>
                            <td>Completed?</td>
                            <td>Target Date:</td>
                        </tr>
                    </thead>
                    <tbody>
                    {
                        todos.map (
                            todo => (
                                <tr key={todo.id}>
                                    <td>{todo.id}</td>
                                    <td>{todo.description}</td>
                                    <td>{todo.done.toString()}</td>
                                    <td>{todo.targetedDate.toDateString()}</td>
                                </tr>
                            )
                        )
                    }
                    </tbody>
                </table>
            </div>
        </div>
    )
}

function HeaderComponent(){
    return  (
        <div className="Header">
            Header <hr/>
        </div>
    )
}

function FooterComponent(){
    return  (
        <div className="Footer">
            <hr/>
            Footer
        </div>
    )
}

function LogoutComponent(){
    return  (
        <div className="Logout">
            <h1>Logged out</h1>
            Goodbye!
        </div>
    )
}