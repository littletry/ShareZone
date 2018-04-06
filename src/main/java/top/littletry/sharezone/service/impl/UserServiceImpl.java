package top.littletry.sharezone.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xiaoleilu.hutool.crypto.digest.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.dao.UserMapper;
import top.littletry.sharezone.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public boolean insertUser(User user) {

        List<User> lists = userMapper.selectList(
                new EntityWrapper<User>().eq("login_name",user.getLoginName())
        );

        if (lists.size() > 0) {
            return false;
        } else {
            String id = UUID.randomUUID().toString();
            String password = DigestUtil.md5Hex(user.getPassword());
            String regTime = DateUtil.date().toString();

            user.setId(id);
            user.setPassword(password);
            user.setRegTime(regTime);

            userMapper.insert(user);

            return true;
        }
    }

    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     */
    @Override
    public boolean selectUser(String loginName, String password) {
        String password1 = DigestUtil.md5Hex(password);
        List<User> lists = userMapper.selectList(
                new EntityWrapper<User>().eq("login_name",loginName)
                        .eq("password",password1)
        );
        if (lists.size() > 0) {
            User user = lists.get(0);
            user.setLastTime(DateUtil.date().toString());
            userMapper.updateById(user);
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
        List<User> lists = userMapper.selectList(
                new EntityWrapper<User>().eq("login_name",loginName)
                        .eq("password",DigestUtil.md5Hex(oldPassword))
        );
        if (lists.size() > 0) {
            User user = lists.get(0);
            user.setPassword(DigestUtil.md5Hex(newPassword));
            userMapper.updateById(user);
            return true;
        } else {
            return false;
        }
    }
}
