package com.tenco.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// http://localhost:8080/req-test
@WebServlet("/req-test")
public class RequestTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RequestTest() {
        super();
    }
    // // http://localhost:8080/gp/req-test?name="홍길동"
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// METHOD <-- GET 방식일 때
		// 요청을 받고 응답시에 MINE TYPE -> text/html
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		// HTTP 요청 메세지의 시작줄에 /req-test?name="홍길동"
		String name = request.getParameter("name");
		// http://localhost:8080/gp/req-test
		String greeting = "Hello, " + (name!= null ? name : "오류발생") + " !!";
		
		// print 대신 write도 써도 된다.
		response.getWriter().print("<html><body> <h2> "+ greeting +" </h2> </body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
