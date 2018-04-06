package top.littletry.sharezone.service.impl;

import top.littletry.sharezone.model.User;
import top.littletry.sharezone.dao.UserMapper;
import top.littletry.sharezone.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
