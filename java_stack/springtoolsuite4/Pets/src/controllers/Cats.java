package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Cat;

/**
 * Servlet implementation class Cat
 */
@WebServlet("/Cat")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @param weight 
     * @param breed 
     * @param name 
     * @see HttpServlet#HttpServlet()
     */
    public Cats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("cname");
		String breed = request.getParameter("cbreed");
		int weight = Integer.parseInt(request.getParameter("cweight"));
		Cat cat = new Cat (name,breed,weight);
		request.setAttribute("cat",cat);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Cat.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
