package top.littletry.sharezone.service;

import top.littletry.sharezone.model.User;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 *
 * @author LittleTry
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     */
    boolean selectUser(String loginName, String password);

    /**
     * 用户密码更新
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    boolean updateUser(String loginName,String oldPassword,String newPassword);

}
