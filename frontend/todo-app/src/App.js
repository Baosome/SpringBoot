import './App.css';

import Counter from "./components/Counter/Counter";

function App() {
  return (
    <div className="App">
      My Todo Application
        <Counter/>
        {/*Default Prop*/}
        <Counter by={2}/>
        <Counter by={5}/>
    </div>
  );
}


export default App;
