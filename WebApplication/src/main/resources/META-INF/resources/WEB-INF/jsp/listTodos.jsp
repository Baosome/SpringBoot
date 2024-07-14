<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>
            Todo page
        </title>
    </head>
    <body>
        <h2>Welcome back, ${name}</h3>
        <hr>
        <h3>Your Todos: </h2>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Completed?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
            
        </table>
    </body>
</html>