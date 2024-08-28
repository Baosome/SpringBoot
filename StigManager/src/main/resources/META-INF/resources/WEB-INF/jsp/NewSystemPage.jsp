<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>New System Page</title>
            <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
            <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
                rel="stylesheet">
        </head>

        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container-fluid">
                    <a href="/" class="navbar-brand">Home</a>
                </div>
            </nav>
            <div class="container mt-2">
                <form:form method="post" modelAttribute="system">
                    <div class="row">
                        <div class="col-md-8">
                            <fieldset class="form-floating mb-2">
                                <form:input path="SystemName" type="text" required="required" class="form-control"
                                    id="floatingInput" placeholder="SystemName" />
                                <form:label path="SystemName" for="floatingInput">System name</form:label>
                                <form:errors path="SystemName" cssClass="text-warning" />
                            </fieldset>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-2">
                            <fieldset class="form-floating mb-2">
                                <form:input path="eMassId" type="number" class="form-control" id="floatingInput"
                                    placeholder="eMass ID" />
                                    <form:label path="eMassId" for="floatingInput">eMass ID</form:label>
                                    <form:errors path="eMassId" cssClass="text-warning" />
                            </fieldset>
                        </div>

                        <fieldset class="m-2">
                            <form:label path="AtoDate">ATD Date: </form:label>
                            <form:input path="AtoDate" type="text" required="required" />
                            <form:errors path="AtoDate" cssClass="text-warning" />
                        </fieldset>
                    </div>

                    <input type="submit" name="" id="" class="btn btn-primary" />
                </form:form>

            </div>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
            <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
            <script type="text/javascript">
                $('#AtoDate').datepicker({
                    format: 'yyyy-mm-dd'
                });
            </script>
        </body>

        </html>