
export default function ResetButton({parentFunc}){
    return (
        <div>
            <button className="resetButton" onClick={parentFunc}>Reset</button>
        </div>
    )
}