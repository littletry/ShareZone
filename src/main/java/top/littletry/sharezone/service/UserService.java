package top.littletry.sharezone.service;

import top.littletry.sharezone.model.User;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 * @author LittleTry
 */
public interface UserService {

    /**
     * 用户注册
     * @param user
     */
    void insertUser(User user);

    boolean selectUser(String loginName,String password);

}
