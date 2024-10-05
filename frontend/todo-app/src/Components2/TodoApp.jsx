import "./TodoApp.css"
import {BrowserRouter, Routes, Route} from "react-router-dom";
import LogoutComponent from "./LogoutComponent";
import HeaderComponent from "./HeaderComponent";
import LoginComponent from "./LoginComponent";
import ListTodoComponent from "./ListTodoComponent";
import ErrorComponent from "./ErrorComponent";
import FooterComponent from "./FooterComponent";
import WelcomeComponent from "./WelcomeComponent";

export default function TodoApp(){
    return (
        <div className="TodoApp">
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

            {/*<LoginComponent></LoginComponent>*/}
            {/*<WelcomeComponent.jsx></WelcomeComponent.jsx>*/}
        </div>
    )
}







