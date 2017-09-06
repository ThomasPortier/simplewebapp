package fr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2960264897526571331L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		//response.setContentType("text/html");
		response.sendRedirect(request.getContextPath() +"/vues/connexion.html");
		// Actual logic goes here.
/*		PrintWriter out = response.getWriter();
		out.println("<h1>Keep Going</h1>");*/
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		System.out.println("Ton id :"+request.getParameter("id"));
		System.out.println("Ton mot de passe :"+request.getParameter("motDePasse"));
		// Actual logic goes here.
	}
}
