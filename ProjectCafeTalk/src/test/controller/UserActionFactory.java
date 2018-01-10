package test.controller;

import test.action.HomeAction;
import test.notice.action.NoticeInsertAction;
import test.notice.action.NoticeInsertFormAction;
import test.notice.action.NoticeListAction;
import test.suggestion.action.SuggestionInsertAction;
import test.suggestion.action.SuggestionInsertFormAction;
import test.suggestion.action.SuggestionListAction;

import test.users.action.LoginAction;
import test.users.action.LoginFormAction;
import test.users.action.LogoutAction;
import test.users.action.SignupAction;
import test.users.action.SignupFormAction;
import test.users.action.UsersDeleteAction;
import test.users.action.UsersInfoAction;
import test.users.action.UsersUpdateAction;
import test.users.action.UsersUpdateFormAction;

public class UserActionFactory {
	private static UserActionFactory factory;
	private UserActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static UserActionFactory getInstance(){
		if(factory==null){
			factory=new UserActionFactory();
		}
		return factory;
	}
	// 요청처리를 할 Action 객체를 리턴해주는 메소드
	public Action action(String command) {
		Action action=null;
		if(command.equals("/home")) {
			action=new HomeAction();
		}else if(command.equals("/users/signup_form")) {
			action=new SignupFormAction();
		}else if(command.equals("/users/signup")) {
			action=new SignupAction();
		}else if(command.equals("/users/login_form")) {
			action=new LoginFormAction();
		}else if(command.equals("/users/login")) {
			action=new LoginAction();
		}else if(command.equals("/users/logout")) {
			action=new LogoutAction();
		}else if(command.equals("/users/private/info")) {
			action=new UsersInfoAction();
		}else if(command.equals("/users/private/updateform")) {
			action=new UsersUpdateFormAction();
		}else if(command.equals("/users/private/update")) {
			action=new UsersUpdateAction();
		}else if(command.equals("/users/private/delete")) {
			action=new UsersDeleteAction();
		}else if(command.equals("/notice/noticelist")) {
			action=new NoticeListAction();
		}else if(command.equals("/notice/private/adminNoticeInsertForm")){
			action=new NoticeInsertFormAction();
		}else if(command.equals("/notice/private/noticeInsert")) {
			action=new NoticeInsertAction();
		}else if(command.equals("/suggestion/suggestion_list")) {
			action=new SuggestionListAction();
		}else if(command.equals("/suggestion/suggestion_insert_form")) {
			action=new SuggestionInsertFormAction();
		}else if(command.equals("/suggestion/suggestion_list")) {
			action=new SuggestionInsertAction();
		}
		return action;
	}
}












