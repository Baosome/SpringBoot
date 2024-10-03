import CounterButton from "./CounterButton";
import {useState} from "react";

export default function Counter() {

    const [count, setCount] = useState(0)

    function incrementParentCounter(by) {
        setCount(count + by)
    }

    function DecreaseParentCounter(by) {
        setCount(count - by)
    }

    return (
        <div>
            <span className="totalCount">{count}</span>
            <CounterButton parentFunc={incrementParentCounter}
                           parentFunc2={DecreaseParentCounter}/> {/*Default Prop*/}
            <CounterButton parentFunc={incrementParentCounter}
                           parentFunc2={DecreaseParentCounter} by={2}/>
            <CounterButton parentFunc={incrementParentCounter}
                           parentFunc2={DecreaseParentCounter} by={5}/>
        </div>
    )
}