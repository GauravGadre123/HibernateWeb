package com.techno.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techno.dao.StudentDao;
import com.techno.entites.Student;

public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		int id = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("stdname");
		int marks = Integer.parseInt(request.getParameter("stdmarks"));

		Student st = new Student(id,name, marks);

		if(StudentDao.updateStudent(st)) 
		{
			RequestDispatcher rd= request.getRequestDispatcher("show.jsp");
			request.setAttribute("msg", "updated student sucessfully");
			rd.forward(request, response);
			

		}


	}

}
