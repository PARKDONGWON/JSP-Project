package test.suggestion.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.controller.Action;
import test.controller.ActionForward;
import test.notice.dao.NoticeDao;
import test.notice.dto.NoticeDto;
import test.suggestion.dao.SuggestionDao;
import test.suggestion.dto.SuggestionDto;

public class SuggestionListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		HttpSession session = request.getSession();
		
	
		String id=(String)request.getSession().getAttribute("id");
		
		
		NoticeDto dto=new NoticeDto();
		
		List<NoticeDto> list=NoticeDao.getInstance().getList(dto);	
		
		request.setAttribute("list", list);
		
		if(id==null) {
			return new ActionForward("/views/users/login_form.jsp");
		}else {
			return new ActionForward("/views/suggestion/suggestion_list.jsp");
		}

		
	}

}
