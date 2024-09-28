import './Counter.css'

export default function counter() {

    // const buttonStyle = {
    //     fontSize:"15px",
    //     backgroundColor: "#0005ab",
    //     width:"100px",
    //     margin:"10px",
    //     color:"white",
    //     padding:"15px",
    //     borderRadius:"20px"
    // };

    function incrementCounter() {
        console.log('Increment clicked')
    }

    return (
        <div className="Counter">
            <span className="count">0</span>
            <div>
                <button className="counterBtn" onClick={incrementCounter}>Increment</button>
            </div>

        </div>
    )
}