package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class ReadHttpData extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("read the data");

		String name = req.getParameter("username");
		String email = req.getParameter("useremail");

		System.out.println(name);
		System.out.println(email);

		resp.getWriter().print("<html><body><h1>Hello," + name + " !!  Welcome to HttpServlet</h1></body></html>");
	}
}
