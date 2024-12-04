package com.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminLoginServlet") // No spaces in URL pattern

public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Replace this with your actual authentication logic
        if ("admin".equals(username) && "admin".equals(password)) {
            // Successful login, redirect to admin dashboard or other page
            response.sendRedirect("adminDashboard.jsp");
        } else {
            // Failed login, display error message or redirect to login page with error message
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }
}