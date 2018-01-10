package test.notice.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.controller.Action;
import test.controller.ActionForward;
import test.notice.dao.NoticeDao;
import test.notice.dto.NoticeDto;

public class NoticeListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("공지사항 리스트 엑션 들어왔따");
		
		HttpSession session = request.getSession();
		
		//session에 저장된 id값을 불러온다.
		String id=(String)request.getSession().getAttribute("id");
		//id를 정상적으로 가져왔는지 확인
		System.out.println("로그인된 ID:"+id+"입니다.");
		
		NoticeDto dto=new NoticeDto();
		
		List<NoticeDto> list=NoticeDao.getInstance().getList(dto);	
		
		request.setAttribute("list", list);
		
		//id가 admin일때 관리자공지사항페이지로 이동한다.
		if (id.equals("admin")) {
			System.out.println("관리자공지사항으로이동!");
			return new ActionForward("/views/notice/private/adminNoticeList.jsp");
		//id가 일반회원일때 일반회원 공지사항으로 이동한다.
		}else {
			System.out.println("일반공지사항으로이동!");
			return new ActionForward("/views/notice/noticelist.jsp");
		}
	
	}

}
