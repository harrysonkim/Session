package session;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/view")
public class viewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/session/view [GET");
	
//		//세션 객체
//		HttpSession session = req.getSession(false);
//	
//		if ( session == null ) {
//			resp.sendRedirect("./create");
//			return;
//		}
		
		// 세션 객체
		HttpSession session = req.getSession();

		// 새로 만들어진 세션이 아니라면 create로 보낸다
		if ( session.isNew() ) {
			resp.sendRedirect("./create");
			return;
		}
		//-------------------------------------------------------------------------

		System.out.println("test 세션 정보 : " + session.getAttribute("test"));
	
		//-------------------------------------------------------------------------
		
		// === 세션 객체 관련 정보 ===
		System.out.println("Session ID : " + session.getId() );
		
		// === 세션을 생성한 시간 ===
		System.out.println("Session ID : " + session.getCreationTime() ); // 에포크타임
		System.out.println("Session ID : " + new Date( session.getCreationTime() )); // java.util.date
		
		// 세션에 최근(마지막) 접속시간
		System.out.println( "Last Accessed Time : " + session.getLastAccessedTime() );
		System.out.println( "Last Accessed Time : " + new Date( session.getLastAccessedTime() ));
		
		// 세션 유지 시간 설정
		session.setMaxInactiveInterval(30);
		
		// 세션 유지 시간
		System.out.println("Max Inactive Interval : " + session.getMaxInactiveInterval() );
		
		req.getRequestDispatcher("/WEB-INF/views/session/view.jsp").forward(req, resp);

	}
	
	
	
	
	
	
	
	
	
}