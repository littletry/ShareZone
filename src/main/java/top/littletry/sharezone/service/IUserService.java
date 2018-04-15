package top.littletry.sharezone.service;

import top.littletry.sharezone.model.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

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
    boolean updateUser(String loginName, String oldPassword, String newPassword);

    /**
     * 分页查询用户信息
     * @param page
     * @return
     */
    List<User> selectAll(int page);
}
