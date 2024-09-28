import './Counter.css'
import {useState} from "react";
import PropTypes from "prop-types";

export default function Counter({by}) {

    // const buttonStyle = {
    //     fontSize:"15px",
    //     backgroundColor: "#0005ab",
    //     width:"100px",
    //     margin:"10px",
    //     color:"white",
    //     padding:"15px",
    //     borderRadius:"20px"
    // };

    // Return array [0,f]
    // const state = useState(0);
    const [count, func] = useState(0);

    function incrementCounter() {
        // state[1](state[0] +1)
        func(count+by)
        console.log(count)
    }

    function decreaseCounter() {
        func(count-by)
        console.log(count)
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterBtn" onClick={incrementCounter}>Add {by}</button>
                <button className="MinusCounterBtn" onClick={decreaseCounter}>Minus {by}</button>
            </div>

        </div>
    )
}

Counter.propType = {
    by: PropTypes.number
}

Counter.defaultProps = {
    by: 1
}