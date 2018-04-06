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
}
