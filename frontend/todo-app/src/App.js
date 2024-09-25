import './App.css';
import {Component} from "react";

function App() {
  return (
    <div className="App">
      My Todo Application
        <FirstComponent></FirstComponent>
        <ClassComponent></ClassComponent>
    </div>
  );
}

function FirstComponent(){
    return (
        <div className="FirstComponent">First Component</div>
    );
}

class ClassComponent extends  Component{
    render() {
        return (
            <div className="ClassComponent"> ClassComponent</div>
        );
    }
}

export default App;
