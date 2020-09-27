package com.techno.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techno.dao.StudentDao;
import com.techno.entites.Student;

public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("stdname");
		int marks = Integer.parseInt(request.getParameter("stdmarks"));

		Student st = new Student(name, marks);

		if(StudentDao.save(st)) 
		{
			RequestDispatcher rd= request.getRequestDispatcher("show.jsp");
			request.setAttribute("msg", "added student sucessfully");
			rd.forward(request, response);
			

		}

	}

}
