package com.webonise.entrapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webonise.entrapp.model.Department;
import com.webonise.entrapp.model.Employee;
import com.webonise.entrapp.service.DepartmentService;
import com.webonise.entrapp.service.DepartmentServiceImpl;
import com.webonise.entrapp.service.DeptService;
import com.webonise.entrapp.service.DeptServiceImpl;
import com.webonise.entrapp.service.EmployeeService;
import com.webonise.entrapp.service.EmployeeServiceImpl;

/**
 * Servlet implementation class Servletoperation
 */
/**
 * @author Anvay The servletoperation servlet perform all the operation of server. this servlet create the object 
 * 				 models and passess this to the service class.
 *
 */
@WebServlet("/Servletoperation")
public class Servletoperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmployeeService empService = new EmployeeServiceImpl();
	
	DepartmentService departmentService = new DepartmentServiceImpl();
	
	DeptService deptService = new DeptServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletoperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	  
	  the doGet() method perform the operation of taking the data from service layer and passes it to the view that are jsp 
	  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList=deptService.getDeptId();
		
		String myStringList[] = new String[myList.size()];
		int i = 0;
		
		for (java.util.Iterator<String> iterator = myList.iterator(); iterator
				.hasNext();i++) {
			String string = (String) iterator.next();
			myStringList[i] = string;
			
		}
		request.setAttribute("myList", myStringList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 *
	 *the doPost() method passes the data to service layer to insert in to database
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String radio = request.getParameter("radio"); 
		
		out.print("<h1> Insertion In " + radio + " Successfull!!! </h1>");
		
		
		if(radio.equals("employee")){
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int did=Integer.parseInt(request.getParameter("did"));
			String dob=request.getParameter("dob");
			
			Employee newEmployee = constructEmployee(id, name, did, dob);
			empService.addEmployee(newEmployee);
		}
	
		if(radio.equals("department")){
		
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
		
			Department newDepartment = constructDepartmnet(id, name);
			departmentService.addDepartment(newDepartment);
		}
		
		
	}
	
	
	private Department constructDepartmnet(int id,String name){
		
		Department department=new Department();
		department.setInfo(id, name);
		return department;
	}
	
	
	private Employee constructEmployee(int id,String name,int did,String dob){
		
		Employee employee = new Employee();
		employee.setInfo(id, name, did, dob);
		return employee;
	}

}
