package test.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.mybatis.SqlMapConfig;
import test.notice.dto.NoticeDto;

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
	//공지사항 삭제 하는 메소드
	public void delete(int num) {
		SqlSession session = null;
		try {
			session=factory.openSession(true);
			session.delete("notice.delete", num);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	
	//공지사항 목록을 보여주는 메소드
	public List<NoticeDto> getList(NoticeDto dto) {
		SqlSession session = null;
		List<NoticeDto> list = null;
		try {
			session=factory.openSession();
			list=session.selectList("notice.getList", dto);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	//공지사항 입력
	public void insert(NoticeDto dto) {
		SqlSession session = null;
		try {
			session=factory.openSession(true);
			session.insert("notice.insert", dto);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	//공지사항 디테일
	public NoticeDto getData(int num) {
		SqlSession session = null;
		NoticeDto resultDto = null;
		try {
			session = factory.openSession();
			resultDto = session.selectOne("notice.getData", num);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return resultDto;
	}
	
}
