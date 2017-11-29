package top.littletry.sharezone.service;

import top.littletry.sharezone.model.User;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 */
public interface UserService {
    public User selectUser(long userId);
}
