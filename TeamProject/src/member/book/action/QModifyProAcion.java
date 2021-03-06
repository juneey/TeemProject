package member.book.action;

import static db.JdbcUtil.*;

import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BookDAO;
import member.book.svc.QModifyProService;
import member.book.svc.ReviewModifyProService;
import vo.ActionForward;
import vo.BookBean;

public class QModifyProAcion implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("QModifyProAcion");
		
		ActionForward forward = null;
		
//		int num = Integer.parseInt(request.getParameter("num"));
//		String page = request.getParameter("page");

//		boolean isRightUser = false;
//		QModifyProService qModifyProService = new QModifyProService();
//		qModifyProService.isWriter(num, request.getParameter("board_pass"));
		
//		if(!isRightUser) {
//			response.setContentType("text/html; charset=UTF-8");
//			PrintWriter out = response.getWriter(); 
//			out.println("<script>"); // 인터넷 밖으로 내보내는 
//			out.println("alert('수정 권한이 없습니다!')"); // 경고 dialog출력
//			out.println("history.go(-1)"); //back은 한칸만가능 go는 히스토리안에서 단계로 넘어갈수있음
//			out.println("</script>"); 
//		}else {
//			BookBean Question = new BookBean();
			
//			Question.setBoard_num(board_num);
//			Question.setBoard_subject(request.getParameter("board_subject"));
//			Question.setBoard_content(request.getParameter("board_content"));
			
//			boolean isModifySuccess = qModifyProService.modifyQuestion(Question);
//		
//			if(!isModifySuccess) {
//				response.setContentType("text/html; charset=UTF-8");
//				PrintWriter out = response.getWriter();
//				out.println("<script>");
//				out.println("alert('글 수정 실패!')"); // 경고 dialog출력
//				out.println("history.go(-1)"); //back은 한칸만가능 go는 히스토리안에서 단계로 넘어갈수있음
//				out.println("</script>");
//				
//			}else{
//				forward = new ActionForward();
//				forward.setPath("BookDetail.book?board_num=" + board_num + "&page=" + page);
//				forward.setPath("ReviewDetail.book");
//				forward.setRedirect(true);
//			}
//		}
		forward = new ActionForward();
		forward.setPath("QDetail.book");
		forward.setRedirect(true);

		return forward;
	}
}
