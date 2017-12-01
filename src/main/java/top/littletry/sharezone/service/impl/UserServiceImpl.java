package top.littletry.sharezone.service.impl;

import org.springframework.stereotype.Service;
import top.littletry.sharezone.dao.UserDao;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.service.UserService;

import javax.annotation.Resource;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:25
 * @author LittleTry
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
