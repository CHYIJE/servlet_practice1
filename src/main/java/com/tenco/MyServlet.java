package com.tenco;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// http://localhost:8080/hello/my-servlet
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
        System.out.println("호출1");
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	System.out.println("호출2");
    }
    
    // 클라이언트가 매번 요청을 하는데 매번 호출이 될까 ?
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    	System.out.println("호출3");
    	System.out.println("서비스 메서드 확인");
    	response.setContentType("text/html; charset=UTF-8");
    	// 부모 클래스 메서드 호출
    	super.service(request, response);
    	
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("호출4-1");
		System.out.println("doGet 메서드 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("호출4-2");
		System.out.println("doPost 메서드 호출");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메서드 호출");
		super.destroy();
	}

}
