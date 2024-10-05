import "./TodoApp.css"
import {useState} from "react";

export default function TodoApp(){
    return (
        <div className="TodoApp">
            Todo Management Application
            <LoginComponent></LoginComponent>
            {/*<WelcomeComponent></WelcomeComponent>*/}
        </div>
    )
}

function LoginComponent(){

    const [userName, setUserName] = useState("Bao")
    const [password, setPassword] = useState("Password")

    const [success, setSuccess] = useState(false)
    const [failed, setFailed] = useState(false)

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
        <dv className="Login">
            <ReturnLoginAttempt></ReturnLoginAttempt>
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
        </dv>
    )
}

function WelcomeComponent(){
    return  (
        <dv className="Welcome">
            Welcome Component
        </dv>
    )
}