package top.littletry.sharezone.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.model.UserQuery;

public interface UserMapper {
    long countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}