import "./TodoApp.css"
import {BrowserRouter, Routes, Route} from "react-router-dom";
import LogoutComponent from "./LogoutComponent";
import HeaderComponent from "./HeaderComponent";
import LoginComponent from "./LoginComponent";
import ListTodoComponent from "./ListTodoComponent";
import ErrorComponent from "./ErrorComponent";
import FooterComponent from "./FooterComponent";
import WelcomeComponent from "./WelcomeComponent";
import AuthProvider from "./Security/AuthContext";

export default function TodoApp(){
    return (
        <div className="TodoApp">
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent/>
                    <Routes>
                        <Route path="/" element={<LoginComponent/>}/>
                        <Route path="/login" element={<LoginComponent/>}/>
                        <Route path="/welcome/:username" element={<WelcomeComponent/>}/>
                        <Route path="todos" element={<ListTodoComponent/>}/>
                        <Route path="logout" element={<LogoutComponent/>}/>
                        <Route path="*" element={<ErrorComponent/>}/>
                    </Routes>
                    <FooterComponent/>
                </BrowserRouter>
            </AuthProvider>

            {/*<LoginComponent></LoginComponent>*/}
            {/*<WelcomeComponent.jsx></WelcomeComponent.jsx>*/}
        </div>
    )
}







