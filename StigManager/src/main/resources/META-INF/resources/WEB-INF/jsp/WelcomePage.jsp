<%@ include file="common/header.jspf" %>
    <title>Welcome Page</title>
    <link rel="stylesheet" type="text/css" href="styles.css/">
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<%@ include file="common/navbar.jspf" %>
    <div class="container">
        <div class="d-flex justify-content-end">
            <a class="btn btn-success m-3" href = "/add-system">Add New System</a>
        </div>
        <div class="bNavBar">test</div>
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>System Name</th>
                    <th>ATO Date</th>
                    <th>eMass ID</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items ="${systems}" var = "system">
                    <tr>
                        <td>${system.systemName}</td>
                        <td>${system.atoDate}</td>
                        <td>${system.eMassId}</td>
                        <td><a class="btn btn-primary" href="/system?id=${system.eMassId}">Manage</a></td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </div>
<%@ include file="common/footer.jspf" %>