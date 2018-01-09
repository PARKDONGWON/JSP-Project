package test.notice.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import test.mybatis.SqlMapConfig;

public class NoticeDao {
	private static NoticeDao dao;
	private static SqlSessionFactory factory;
	private NoticeDao() {}
	
	public static NoticeDao getInstance() {
		if(dao==null) {
			dao=new NoticeDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	//공지사항 등록
	
	//공지사항 수정
	
	//공지사항 삭제
	
	//공지사항 목록리턴
	
	//조회수증가
	
	//글의정보리턴
}
