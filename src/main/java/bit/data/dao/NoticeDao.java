package bit.data.dao;

import bit.data.dto.NoticeDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class NoticeDao implements NoticeDaoInter {
	@Autowired
	SqlSession session;
	String ns = "bit.data.dao.NoticeDao.";

	@Override
	public NoticeDto getNotice(int notice_num) {
		return session.selectOne(ns+"getNotice",notice_num);
	}

	@Override
	public int getTotalCount(Map<String, String> map) {
		return session.selectOne(ns+"getTotalCount",map);
	}

	@Override
	public List<NoticeDto> getPagingList(Map<String, Object> map) {
		return session.selectList(ns+"getPagingList",map);
	}

	@Override
	public void insertNotice(NoticeDto dto) {
		session.insert(ns+"insertNotice",dto);
	}

	@Override
	public NoticeDto getUser_num(int user_num) {
		return session.selectOne(ns+"getData",user_num);
	}


	@Override
	public void updateNotice(NoticeDto dto) {
		session.update(ns+"updateNotice",dto);
	}

	@Override
	public void deleteNotice(int notice_num) {
		session.delete(ns+"deleteNotice",notice_num);
	}
}
