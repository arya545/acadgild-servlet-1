package com.inf;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.DocumentType;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String title ="Using GET method to read form data";
		String doctype="<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
		out.println(doctype+"<html>\n"+
         "<head><title>"+title+"</title></head>\n"+
		 "<body bgcolor=\"#f0f0f0\">\n"+
		"<h1 align=\"center\">"+title+"</h1>\n"+
		 "<ul>\n"+
		"<li><b>FirstName</b> : "
		 +request.getParameter("first_name")+"\n"+
		"<li><b>LastName</b>: "
		 +request.getParameter("last_name")+"\n"+
		"</ul>\n"+
		 "</body></html>");
		 ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
