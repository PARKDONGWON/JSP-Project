package test.notice.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.notice.dao.NoticeDao;
import test.notice.dto.NoticeDto;

public class NoticeDetailAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		NoticeDto dto = new NoticeDto();
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("num : "+num);
		dto.setNum(num);
		NoticeDto resultDto = NoticeDao.getInstance().getData(num);
		
		request.setAttribute("dto", resultDto);
		System.out.println("디테일페이지");
		String id=(String)request.getSession().getAttribute("id");
		return new ActionForward("/views/notice/noticeDetail.jsp");
	} 

}
