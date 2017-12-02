package top.littletry.sharezone.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.service.UserService;

import javax.annotation.Resource;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:30
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Resource
    private UserDao userDao;
    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = userDao.selectUser(id);
        System.out.println(user.toString());
    }
}