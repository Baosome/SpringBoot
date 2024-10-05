export default function ListTodoComponent(){

    const today = new Date()
    const TargetDate = new Date(today.getFullYear()+12, today.getMonth(), today.getDate())

    const todos = [
        {id: 1, description: "Learn how to do a backflip", done: false, targetedDate: TargetDate},
        {id: 2, description: "Learn to read", done: false, targetedDate: TargetDate},
        {id: 3, description: "Learn to write", done: false, targetedDate: TargetDate},

    ]

    return  (
        <div className="container">
            <h1>My Todo List</h1>
            <div>
                <table className="table">
                    <thead>
                    <tr>
                        <td>Id:</td>
                        <td>Description:</td>
                        <td>Completed?</td>
                        <td>Target Date:</td>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        todos.map (
                            todo => (
                                <tr key={todo.id}>
                                    <td>{todo.id}</td>
                                    <td>{todo.description}</td>
                                    <td>{todo.done.toString()}</td>
                                    <td>{todo.targetedDate.toDateString()}</td>
                                </tr>
                            )
                        )
                    }
                    </tbody>
                </table>
            </div>
        </div>
    )
}

