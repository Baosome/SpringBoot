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
                <div class="row">
                    <div class="col">
                        <h3>Hardware:</h3>
                    </div>
                    <div class="col-1 mb-1">
                        <a href="" class="btn-sm btn-success">+</a>
                    </div>
                    <ol class="list-group">
                        <li class="list-group-item">
                            <c:forEach items ="${Hardwares}" var = "hardware">
                                <p class="d-inline-flex gap-1 w-100">
                                    <a class="btn btn-secondary w-100" data-bs-toggle="collapse"
                                       href="#${hardware.name}${hardware.componentId}" role="button"
                                       aria-expanded="false" >${hardware.name} <span class="badge bg-primary">4</span></a>
                                </p>
                                <div class="collapse multi-collapse mb-3" id="${hardware.name}${hardware.componentId}">
                                    <div class="card card-body">
                                        <div class="row">
                                            <div class="col">
                                                <div class="container-fluid">
                                                    <span class="badge bg-primary">STIG1</span>
                                                </div>
                                            </div>
                                            <div class="col-1">
                                                <button class="text-white fw-bold bg-success" data-bs-toggle="modal" data-bs-target="#myModal">Add</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </li>
                    </ol>
                </div>

                <div class="row mt-5">
                    <div class="col">
                        <h3>Software:</h3>
                    </div>
                    <div class="col-1 mb-1">
                        <a href="" class="btn-sm btn-success">+</a>
                    </div>
                    <ol class="list-group">
                        <li class="list-group-item">
                            <c:forEach items ="${Softwares}" var = "software">
                                <p class="d-inline-flex gap-1 w-100">
                                    <a class="btn btn-secondary w-100" data-bs-toggle="collapse"
                                       href="#${software.name}${software.componentId}" role="button"
                                       aria-expanded="false" >${software.name} <span class="badge bg-primary">4</span></a>
                                </p>
                                <div class="collapse multi-collapse mb-3" id="${software.name}${software.componentId}">
                                    <div class="card card-body">
                                        <div class="row">
                                            <div class="col">
                                                <div class="container-fluid">
                                                    <span class="badge bg-primary">STIG1</span>
                                                </div>
                                            </div>
                                            <div class="col-1">
                                                <button class="text-white fw-bold bg-success" data-bs-toggle="modal" data-bs-target="#myModal">Add</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </li>
                    </ol>
                </div>

            </div>
        </div>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>