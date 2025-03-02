<%@ include file="common/header.jspf" %>
        <title>New System Page</title>
        <link rel="stylesheet" href="../myCSS/baoCSS.css">
        <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
        <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    </head>
    
    <body>
<%--    <%@ include file="common/navbar.jspf" %>--%>
    <%@ include file="common/bNavBar.jspf" %>
        <div class="container mt-2">
            <form:form method="post" modelAttribute="system">
                <div class="row">
                    <div class="col-md-8">
                        <fieldset class="form-floating mb-2">
                            <form:input path="SystemName" type="text" required="required" class="form-control"
                                id="floatingInput"/>
                            <form:label path="SystemName" for="floatingInput">System name</form:label>
                        </fieldset>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-2">
                        <fieldset class="form-floating mb-2">
                            <form:input path="eMassId" type="number" class="form-control" id="floatingInput"/>
                            <form:label path="eMassId" for="floatingInput">eMass ID</form:label>
                        </fieldset>
                    </div>
    
                    <fieldset class="m-2">
                        <form:label path="AtoDate">ATD Date: </form:label>
                        <form:input path="AtoDate" type="text" required="required" />
                    </fieldset>
                </div>
    
                <input type="submit" name="" id="" class="btn btn-primary" />
            </form:form>
    
        </div>
<%@ include file="common/footer.jspf" %>