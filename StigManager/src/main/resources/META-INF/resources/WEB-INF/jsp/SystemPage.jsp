<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>System Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
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
                <div class="col-2 mb-1">
                    <button class="text-white fw-bold bg-success" data-bs-toggle="modal"
                            data-bs-target="#AddComponent">Add Component</button>

                    <div class="modal" id="AddComponent" tabindex="-1">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Fill out hardware info:</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <form:form method="post" modelAttribute="component">
                                        <fieldset class="form-floating mb-2">
                                            <form:input path="name" type="text" required="required" class="form-control"
                                                        id="floatingInput"/>
                                            <form:label path="name" for="floatingInput">Component name</form:label>
                                        </fieldset>
                                        <hr>
                                        <h2 class="fs-6">Choose Component Type:</h2>
                                        <div class="row">
                                            <div class="col">
                                                <div class="form-check">
                                                    <form:radiobutton path="componentType" class="form-check-input"
                                                                name="flexRadioDefault" id="ComponentType"
                                                                      value="Hardware"/>
                                                    <form:label path="componentType" class="form-check-label" >
                                                        Hardware
                                                    </form:label>
                                                </div>
                                            </div>
                                            <div class="col">
                                                <div class="form-check">
                                                    <form:radiobutton path="componentType" class="form-check-input"
                                                                name="flexRadioDefault" id="ComponentType"
                                                                      value="Software"/>
                                                    <form:label path="componentType" class="form-check-label">
                                                        Software
                                                    </form:label>
                                                </div>
                                            </div>
                                        </div>
                                        <hr>
                                        <fieldset class="form-floating mb-2">
                                            <form:input path="version" type="text" class="form-control" id="floatingInput"/>
                                            <form:label path="version" for="floatingInput">Version</form:label>
                                        </fieldset>
                                        <hr>
                                        <fieldset class="m-2">
                                            <form:label path="ldaDate">LDA Date:</form:label>
                                            <form:input path="ldaDate" type="text" required="required"/>
                                        </fieldset>
                                        <hr>
                                        <input type="submit" value="Save Changes" class="btn btn-primary" />
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <ol class="list-group">
                    <li class="list-group-item">
                        <c:forEach items="${Hardwares}" var="hardware">
                            <p class="d-inline-flex gap-1 w-100">
                                <a class="btn btn-secondary w-100" data-bs-toggle="collapse"
                                   href="#${hardware.getRef()}" role="button" aria-expanded="false">${hardware.name}
                                    <span class="badge bg-primary">${Hardwares.size()}</span></a>
                            </p>
                            <div class="collapse multi-collapse mb-3" id="${hardware.getRef()}">
                                <div class="card card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class="container-fluid">
                                                <span class="badge bg-primary">STIG1</span>
                                            </div>
                                        </div>
                                        <div class="col-1">
                                            <button class="text-white fw-bold bg-success" data-bs-toggle="modal"
                                                    data-bs-target="#${hardware.getRef()}2">Add
                                            </button>
                                            <div class="modal" id="${hardware.getRef()}2" tabindex="-1">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title">Choose your STIGs</h5>
                                                            <button type="button" class="btn-close"
                                                                    data-bs-dismiss="modal" aria-label="Close"></button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="row">
                                                                <c:forEach items="${Stigs}" var="stig">
                                                                    <div class="col-6">
                                                                        <div class="form-check">
                                                                            <input type="checkbox"
                                                                                   class="form-check-input">
                                                                            <label for="flexCheckDefault"
                                                                                   class="form-check-label">
                                                                                    ${stig.name} V${stig.version}
                                                                                R${stig.release}
                                                                            </label>
                                                                        </div>
                                                                    </div>
                                                                </c:forEach>
                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                    data-bs-dismiss="modal">Close
                                                            </button>
                                                            <button type="button" class="btn btn-primary">Save changes
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
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
                <ol class="list-group">
                    <li class="list-group-item">
                        <c:forEach items="${Softwares}" var="software">
                            <p class="d-inline-flex gap-1 w-100">
                                <a class="btn btn-secondary w-100" data-bs-toggle="collapse"
                                   href="#${software.getRef()}" role="button"
                                   aria-expanded="false">${software.name} <span class="badge bg-primary">4</span></a>
                            </p>
                            <div class="collapse multi-collapse mb-3" id="${software.getRef()}">
                                <div class="card card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class="container-fluid">
                                                <span class="badge bg-primary">STIG1</span>
                                            </div>
                                        </div>
                                        <div class="col-1">
                                            <button class="text-white fw-bold bg-success" data-bs-toggle="modal"
                                                    data-bs-target="#${software.getRef()}2">Add
                                            </button>
                                            <div class="modal" id="${software.getRef()}2" tabindex="-1">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title">Choose your STIGs</h5>
                                                            <button type="button" class="btn-close"
                                                                    data-bs-dismiss="modal" aria-label="Close"></button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="row">
                                                                <c:forEach items="${Stigs}" var="stig">
                                                                    <div class="col-6">
                                                                        <div class="form-check">
                                                                            <input type="checkbox"
                                                                                   class="form-check-input">
                                                                            <label for="flexCheckDefault"
                                                                                   class="form-check-label">
                                                                                    ${stig.name} V${stig.version}
                                                                                R${stig.release}
                                                                            </label>
                                                                        </div>
                                                                    </div>
                                                                </c:forEach>
                                                            </div>

                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                    data-bs-dismiss="modal">Close
                                                            </button>
                                                            <button type="button" class="btn btn-primary">Save changes
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
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
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
    $('#ldaDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>
</body>
</html>