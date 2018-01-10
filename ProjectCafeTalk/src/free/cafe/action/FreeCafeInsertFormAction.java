package free.cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import free.cafe.controller.Action;
import free.cafe.controller.ActionForward;

public class FreeCafeInsertFormAction extends Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/views/freecafe/private/insertform.jsp");
	}

}
