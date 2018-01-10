package test.suggestion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class SuggestionInsertFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
	
		
		
		System.out.println("InsertForm!!!");
		return new ActionForward("/views/suggestion/private/insert_form.jsp");
	}

}
