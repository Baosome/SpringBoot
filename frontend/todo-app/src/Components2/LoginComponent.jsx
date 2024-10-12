import {useNavigate} from "react-router-dom";
import React, {useState} from "react";
import {useAuth} from "./Security/AuthContext";
export default function LoginComponent(){
    const [userName, setUserName] = useState("Bao")
    const [password, setPassword] = useState("Password")

    const [success, setSuccess] = useState(false)
    const [failed, setFailed] = useState(false)

    const navigate = useNavigate()

    const authContext = useAuth();

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

            authContext.setAuthenticated(true)
        } else {
            setSuccess(false)
            setFailed(true)

            authContext.setAuthenticated(true)
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

