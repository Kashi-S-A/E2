package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hello Welcome to app");

		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String phone = req.getParameter("phno");
		String pwd = req.getParameter("pwd");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(pwd);

		PrintWriter pw = res.getWriter();
		pw.print("<html><body><h1>Welcome User, " + name + "</h1></body></html>");
	}
}
