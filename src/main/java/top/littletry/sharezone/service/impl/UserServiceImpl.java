package top.littletry.sharezone.service.impl;

import com.xiaoleilu.hutool.crypto.digest.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.littletry.sharezone.dao.UserMapper;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.model.UserQuery;
import top.littletry.sharezone.service.UserService;

import java.util.List;
import java.util.UUID;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:25
 *
 * @author LittleTry
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param user
     */
    @Override
    public void insertUser(User user) {

        String id = UUID.randomUUID().toString();
        String password = DigestUtil.md5Hex(user.getPassword());
        String regTime = DateUtil.date().toString();

        user.setId(id);
        user.setPassword(password);
        user.setRegTime(regTime);
        user.setLastTime(regTime);

        userMapper.insert(user);
    }

    /**
     * 用户登录
     *
     * @param loginName
     * @param password
     * @return
     */
    @Override
    public boolean selectUser(String loginName, String password) {
        String password1 = DigestUtil.md5Hex(password);

        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password1);

        List<User> users = userMapper.selectByExample(userQuery);

        if (users.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 用户密码更新
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @Override
    public boolean updateUser(String loginName, String oldPassword, String newPassword) {
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(DigestUtil.md5Hex(oldPassword));
        try{
            List<User> users = userMapper.selectByExample(userQuery);
            User user = users.get(0);
            if (StrUtil.isNotBlank(user.getLoginName())){
                user.setPassword(DigestUtil.md5Hex(newPassword));
                userMapper.updateByPrimaryKey(user);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
