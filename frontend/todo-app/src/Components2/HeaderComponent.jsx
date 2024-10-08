import {Link} from "react-router-dom";
import React from "react";
import {useAuth} from "./Security/AuthContext";

export default function HeaderComponent(){
    // const authContext = useContext(AuthContext)

    const authContext = useAuth()
    const isAuthenticated = authContext.isAuthenticated

    // console.log(authContext.number)
    console.log(authContext)

    return (
        <header className="border-bottom border-light border-5 mb-5 p-2">
            <div className="container">
                <div className="row">
                    <nav className="navbar navbar-expand-lg">
                        {isAuthenticated &&
                            <div className="collapse navbar-collapse">
                                <ul className="navbar-nav">
                                    <li className="navbar-brand ms-2 fs-2 fw-bold text-black">
                                        <Link className="nav-link" to="/welcome/Bao">Home</Link>
                                    </li>
                                </ul>
                                <ul className="navbar-nav">
                                    <li className="nav-item ">
                                        <Link className="nav-link fs-5" to="/todos">Todos</Link>
                                    </li>
                                </ul>
                            </div>}

                            <ul className="navbar-nav">
                                {!isAuthenticated &&
                                    <li className="nav-item fs-5">
                                        <Link className="nav-link" to="/login">Login</Link>
                                    </li>
                                }
                                {isAuthenticated &&
                                    <li className="nav-item fs-5">
                                        <Link className="nav-link" to="/logout"
                                            onClick={()=> authContext.setAuthenticated(false)}>
                                            Logout</Link>
                                    </li>
                                }
                            </ul>
                    </nav>
                </div>
            </div>
        </header>

    )
}
