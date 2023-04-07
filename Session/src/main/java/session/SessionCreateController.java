package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/create")
public class SessionCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	System.out.println("/session/create [GET]");

	//세션 객체 생성
	HttpSession session = req.getSession(); // => true 상태와 같다
	
//	HttpSession session = req.getSession(false);
//	System.out.println(session);

//	HttpSession session = req.getSession(true);
//	System.out.println(session);
	
	// HttpSession 객체가 존지하지 않는 경우
	// 	req.getSession(false) 는 새로운 세션객체를 만들지 않는다
	// 	req.getSession(true) 는 새로운 세션객체를 만든다
	
	//-----------------------------------------------------------
	
	// 세션 컨텍스트 정보 저장하기
	session.setAttribute("test", "Apple");
	
	req.getRequestDispatcher("/WEB-INF/views/session/create.jsp").forward(req, resp);
	
	
	
	
	
	
	}
	
	
}
