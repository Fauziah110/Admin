<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="login-container">
        <img src="beach-image.jpg" alt="Beach Image">
        <h2>Admin Sign In</h2>
        <form action="login" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit">Sign In</button>

            <p>Don't have an account? <a href="signup.jsp">Sign Up Now</a></p>
        </form>
        <p style="color: red"><%= request.getParameter("error") %></p>
    </div>
</body>
</html>