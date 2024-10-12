import './Counter.css'
//import {useState} from "react";
import PropTypes from "prop-types";

// Parameters have to be the same name
export default function CounterButton({by, parentFunc, parentFunc2}) {
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
    //const [count, func] = useState(0);

    // function incrementCounter() {
    //     // state[1](state[0] +1)
    //     //func(count+by)
    //     parentFunc(by);
    //     //console.log(count)
    // }

    // function decreaseCounter() {
    //     //func(count-by)
    //     parentFunc2(by);
    //     //console.log(count)
    // }

    //Use arrow function to call parameter if called directly
    return (
        <div className="Counter">
            <div>
                <button className="counterBtn" onClick={() => parentFunc(by)}>Add {by}</button>
                <button className="MinusCounterBtn" onClick={() => parentFunc2(by)}>Minus {by}</button>
            </div>

        </div>
    )
}

CounterButton.propType = {
    by: PropTypes.number
}

CounterButton.defaultProps = {
    by: 1
}