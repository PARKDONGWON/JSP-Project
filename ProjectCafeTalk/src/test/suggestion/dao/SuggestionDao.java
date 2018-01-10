package test.suggestion.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.mybatis.SqlMapConfig;
import test.notice.dao.NoticeDao;
import test.suggestion.dto.SuggestionDto;

public class SuggestionDao {
	private static SuggestionDao dao;
	private static SqlSessionFactory factory;
	private SuggestionDao() {}
	
	public static SuggestionDao getInstance() {
		if(dao==null) {
			dao=new SuggestionDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	//건의사항 목록을 보여주는 메소드
	public List<SuggestionDto> getList(SuggestionDto dto){
		SqlSession session=null;
		List<SuggestionDto> list=null;
		try {
			session=factory.openSession();
			session.selectList("suggestion.getList",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	//건의사항 입력
	public void insert(SuggestionDto dto) {
		SqlSession session=null;
		try {
			session=factory.openSession(true);
			session.insert("suggestion.insert",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
