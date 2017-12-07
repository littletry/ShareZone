package top.littletry.sharezone.dao;

import org.apache.ibatis.annotations.Param;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.model.UserQuery;

import java.util.List;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 * @author LittleTry
 */
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
