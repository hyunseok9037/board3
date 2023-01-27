package shop.mtcoding.board2.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
    public int insert(String title, int userId);

    public int updateById(int id, String title);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);
}
