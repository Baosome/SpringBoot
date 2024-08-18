<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New System Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a href="/" class="navbar-brand">Home</a>
        </div>
    </nav>
    <div class="container">
        <h2>Enter new system information:</h2>
        <div class="row">
            <div class="col-md-8">
                <div class="form-floating mb-2">
                    <input type="text" class="form-control" id="floatingInput" placeholder="SystemName">
                    <label for="floatingInput">System Name</label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2 mb-2">
                <input type="radio" class="btn-check" name="options-outlined" id="success-outlined" autocomplete="off" checked>
                <label class="btn btn-outline-success" for="success-outlined">NIPR</label>
                <input type="radio" class="btn-check" name="options-outlined" id="danger-outlined" autocomplete="off">
                <label class="btn btn-outline-danger" for="danger-outlined">SIPR</label>
            </div>
            <div class="col-md-6">
                <div class="form-floating mb-3">
                    <input type="number" class="form-control" id="floatingInput" placeholder="eMassID">
                    <label for="floatingInput">eMass ID</label>
                </div>
            </div>
        </div>


        
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>