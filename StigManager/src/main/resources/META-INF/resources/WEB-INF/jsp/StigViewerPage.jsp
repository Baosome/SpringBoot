<%@ include file="common/header.jspf" %>
    <title>Welcome Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="../myCSS/baoCSS.css">
</head>
<body>
<%@ include file="common/navbar.jspf" %>
<%@ include file="common/bNavBar.jspf" %>
    <div class="container">
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>Stig Name</th>
                    <th>Version</th>
                    <th>Release</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items ="${Stigs}" var = "stig">
                    <tr>
                        <td>${stig.name}</td>
                        <td>${stig.version}</td>
                        <td>${stig.release}</td>
                  </tr>
                </c:forEach>
            </tbody>
          </table>
    </div>

<%@ include file="common/footer.jspf" %>