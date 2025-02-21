package com.tenco;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HttpServlet 클래스를 상속 받아서 내가 정의한 클래스가 선언이 된다.
 * why? HTTP 프로토콜을 통한 request, respons 처리를 할 수 있기 때문이다.
 * 
 * URL 맵핑에 대한 개념을 알자.
 * 클라이언트가 특정 URL을 요청했을 때 해당 URL에 대응하는 서블릿을
 * 실행하도록 설정하는 것을 의미
 * URL 맵핑 - 2가지 방법 알아보자.
 */

 @WebServlet(urlPatterns = "/hello-servlet2", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 생성자
    public HelloServlet() {
    	super();
    	System.out.println("생성자가 호출됨");
    }

    // 해당 서블릿 클래스가 인스턴스화 될 때 단 한번 실행하는 메서드이다.
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 메서드가 호출됨");
	}
	
	// 메모리에서 내려가기 직전에 호출 되는 메서드이다.
	public void destroy() {
		System.out.println("destory 호출");
	}
	
	// GET 요청으로 들어올 때 동작됨
	// 주소 설계 - http://localhost:8080/hello/hello-Servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// MIME TYPE - 인터넷 세상에서 데이터의 유형을 나타내는 표준 방식
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		// 스트림을 어디에서 뽑아야 될까?
		response.getWriter().write("<html><body><h1>국력은 국방력에서 나온다</h1>"
				+ "<h2>1.멸북통일 최선봉 천하무적 백골사단</h2>"
				+ "<h2>2.쳐부수자 북괴군 때려잡자 김부자</h2>"
				+ "<h2>3.김부자는 미친개 몽둥이가 약!!!</h2>"
				+ "<h2>4.부관참시 김일성 능지처참 김정일,정은</h2>"
				+ "<h2>5.북괴군의 가슴팍에 총칼을 박자!!</h2>"
				+ "</body></html>");
	}
	
	// POST 요청으로 들어올 때 동작됨
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 문제 -> post 요청이 들어오는 것을 확인하고
		// 응용해서 데이터 또는 html 형식으로 응답처리 해보시오.
		doGet(request, response);
		
		System.out.println("post확인");
		
	}

}
