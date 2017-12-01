package top.littletry.sharezone.dao;

import top.littletry.sharezone.model.User;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 * @author LittleTry
 */
public interface UserDao {
    /**
     * 根据id查询用户名
     * @param id
     * @return
     */
    User selectUser(long id);
}
