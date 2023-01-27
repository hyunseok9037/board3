package shop.mtcoding.board2.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public int insert(String username, String password, String email);

    public int updateById(int id, String password, String email);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);
}
