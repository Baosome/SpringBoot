<%@ include file="common/header.jspf" %>
    <title>System Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
</head>
<body>

<%@ include file="common/navbar.jspf" %>
<div class="container">

    <div class="row bg-body">
        <%@ include file="SystemPageHelper/SystemDetails.jspf" %>
        <div class="col-9 mt-3">
            <div class="row">
                <div class="col">
                    <h3>Hardware:</h3>
                </div>

                <%@ include file="SystemPageHelper/AddComponentBtn.jspf" %>

                <%@ include file="SystemPageHelper/Hardware/HardwareMain.jspf" %>

            </div>

            <div class="row mt-5">
                <div class="col">
                    <h3>Software:</h3>
                </div>
                <%@ include file="SystemPageHelper/Software/SoftwareMain.jspf" %>
            </div>

        </div>
    </div>
</div>
<%@ include file="common/footer.jspf" %>