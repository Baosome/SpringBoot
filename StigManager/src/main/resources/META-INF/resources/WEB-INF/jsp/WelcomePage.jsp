<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a href="/" class="navbar-brand">Home</a>
        </div>
    </nav>
    <div class="container ">
        <div class="d-flex justify-content-end">
            <button class="btn btn-success m-3">Add New System</button>
        </div>
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>#</th>
                    <th>System Name</th>
                    <th>ATO Date</th>
                    <th>eMass ID</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>BAOLAN</td>
                    <td>3/6/2024</td>
                    <td>1234</td>
                    <td><button type="button" class="btn btn-primary">Go</button></td>
                  </tr>
            </tbody>
          </table>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>