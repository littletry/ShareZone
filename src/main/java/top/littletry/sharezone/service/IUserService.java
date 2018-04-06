package top.littletry.sharezone.service;

import top.littletry.sharezone.model.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
public interface IUserService extends IService<User> {

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean insertUser(User user);
}
