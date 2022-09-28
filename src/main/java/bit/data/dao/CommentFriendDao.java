package bit.data.dao;

import bit.data.dto.CommentFriendDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CommentFriendDao implements CommentFriendDaoInter {

    @Autowired
    SqlSession session;

    String ns="bit.data.dao.CommentFriendDao.";
    @Override
    public List<CommentFriendDto> selectAllComments(int friend_num) {
        return session.selectList(ns+"selectAllComments", friend_num);
    }

    @Override
    public void insertComment(CommentFriendDto dto) {
        session.insert(ns+"insertComment", dto);
    }

    @Override
    public void updateRestep(Map<String, Integer> map) {
        session.update(ns+"updateRestep", map);
    }

    @Override
    public CommentFriendDto selectCommentByNum(int num) {
        return session.selectOne(ns+"selectCommentByNum", num);
    }

    @Override
    public void deleteByNum(int num) {
        session.delete(ns+"deleteByNum", num);
    }
}