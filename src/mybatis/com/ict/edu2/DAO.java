package mybatis.com.ict.edu2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.com.ict.edu2.DBService;
import mybatis.com.ict.edu2.VO;

public class DAO {
	private static SqlSession ss;

	// 싱글턴 패턴(동기화 처리) : 프로그램이 종료될 때까지 한 번 만들어진 객체를 재사용
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}

	// DB 처리하는 메서드들

	// customer테이블 전체 보기
	// select, 결과 여러개, 파라미터 x
	public static List<VO> getList() {
		List<VO> list = null;
		// selectList() : 결과가 하나 이상일 때
		// selectOne() : 결과가 반드시 하나일 때
		// 파라미터가 있는 메서드와 없는 메서드로 나뉨
		// selectList("mapper의 id", [파라미터(파라미터가 있는 메서드일 때 입력 없으면 입력 x]);
		list = getSession().selectList("custList");
		return list;
	}

	// select, 결과 한 개, 파라미터 있음(String)
	public static VO getOne(String custid) {
		VO vo = getSession().selectOne("custOne", custid);
		return vo;
	}

	// insert, delete, update 결과 int, 파라미터 무조건 있음
	// 반드시 commit을 해야함
	public static int getInsert(VO vo) {
		int result = getSession().insert("custIns", vo);
		ss.commit();
		return result;
	}

	public static int getDelete(VO vo) {
		int result = getSession().delete("custDel", vo);
		ss.commit();
		return result;
	}

	public static int getUpdate(VO vo) {
		int result = getSession().update("custUp", vo);
		ss.commit();
		return result;
	}
}
