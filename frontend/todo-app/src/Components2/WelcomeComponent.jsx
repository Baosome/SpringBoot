import {useParams, Link} from "react-router-dom";

export default function WelcomeComponent(){
    // const params = useParams()
    // params.username - Also works
    const {username} = useParams()

    return  (
        <div className="Welcome">
            <h1>Welcome! {username}</h1>
            <h2>Your <Link to="/todos">todos</Link>
            </h2>
        </div>
    )
}