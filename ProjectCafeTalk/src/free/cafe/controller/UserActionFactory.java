package free.cafe.controller;

import free.action.HomeAction;
import free.cafe.action.FreeCafeInsertAction;
import free.cafe.action.FreeCafeInsertFormAction;
import free.cafe.action.FreeCafeListAction;


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
		}else if(command.equals("/freecafe/freelist")) {
			action=new FreeCafeListAction();
		}else if(command.equals("/freecafe/insert")) {
			action=new FreeCafeInsertAction();
		}else if(command.equals("/freecafe/private/insertform")) {
			action=new FreeCafeInsertFormAction();
		}
		return action;
	}
}











