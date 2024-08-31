<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>System Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a href="/" class="navbar-brand">Home</a>
        </div>
    </nav>
    <div class="container">
        <div class="row bg-body">
            <div class="col mt-4">
                <h4>System Name: </h4>
                <p>${system.systemName}</p>
                <h4>ATO Date: </h4>
                <p>${system.atoDate}</p>
                <h4>eMASS ID: </h4>
                <p>${system.eMassId}</p>
            </div>
            <div class="col-9 mt-3">
                <h2>Hardware:</h2>
                <ol class="list-group">
                    <li class="list-group-item">
                        <p class="d-inline-flex gap-1 w-100">
                            <a class="btn btn-secondary w-100" data-bs-toggle="collapse"
                               href="#HardwareDetails" role="button"
                               aria-expanded="false" aria-controls="HardwareDetails">Toggle first element</a>
                        </p>
                        <div class="collapse multi-collapse" id="HardwareDetails">
                            <div class="card card-body">
                                Some placeholder content for the first collapse component of this multi-collapse example. This panel is hidden by default but revealed when the user activates the relevant trigger.
                            </div>
                        </div>

                    </li>
                </ol>
            </div>

        </div>

    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>