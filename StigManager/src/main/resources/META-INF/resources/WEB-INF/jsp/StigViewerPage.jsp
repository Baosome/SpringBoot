<%@ include file="common/header.jspf" %>
    <title>Welcome Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="../myCSS/baoCSS.css">
</head>
<body>
<%--<%@ include file="common/navbar.jspf" %>--%>
<div class="bcontent bcloseContent">
<%@ include file="common/bNavBar.jspf" %>
    <div>
        <div class="container mt-2 mb-2 d-flex justify-content-end">
            <form method="get">
                <fieldset>
                    <label for="search">Search</label>
                    <input id ="search" name = "search" type="text">
                    <input type="submit" class = "btn btn-primary">
                </fieldset>
            </form>
        </div>
        <div class="container">
            <table class="table">
                <thead class="table-dark">
                <tr>
                    <th>Stig Name</th>
                    <th>Version</th>
                    <th>Release</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items ="${Stigs}" var = "stig">
                    <tr>
                        <td>${stig.name}</td>
                        <td>${stig.version}</td>
                        <td>${stig.release}</td>
                        <td><a href="/viewchecklist?id=${stig.stigId}" class = "btn btn-primary">View</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<%@ include file="common/footer.jspf" %>