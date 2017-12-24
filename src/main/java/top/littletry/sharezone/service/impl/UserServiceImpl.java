package top.littletry.sharezone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.littletry.sharezone.common.utils.ApplicationUtil;
import top.littletry.sharezone.common.utils.DateTimeUtil;
import top.littletry.sharezone.dao.UserMapper;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.model.UserQuery;
import top.littletry.sharezone.service.UserService;

import java.util.Date;
import java.util.List;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:25
 * @author LittleTry
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        String id = ApplicationUtil.randomUUID();
        String password = ApplicationUtil.md5Hex(user.getPassword());
        String regTime = DateTimeUtil.convert2String(new Date());

        user.setId(id);
        user.setPassword(password);
        user.setRegTime(regTime);
        user.setLastTime(regTime);

        userMapper.insert(user);
    }

    @Override
    public boolean selectUser(String loginName, String password) {
        String password1 = ApplicationUtil.md5Hex(password);

        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password1);

        List<User> users = userMapper.selectByExample(userQuery);

        if (users.size()>0){
            return true;
        }else {
            return false;
        }
    }
}
