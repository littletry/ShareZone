package top.littletry.sharezone.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/3
 * Time: 21:58
 *
 * @author LittleTry
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestUser {
    //采用mybatis逆向工程生成的代码来使用的，现已注释，准备后面手写SQL，不依赖自动生成
    /*@Autowired
    private UserMapper userMapper;

    *//**
     * 通过id查询用户
     * @throws Exception
     *//*
    @Test
    public void SelectUserById() throws Exception{
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(user);
    }
    @Test
    public void SelectUserByExample() throws Exception{
        //指定字段查询
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andPasswordLike("%ht%");
        List<User> userList = userMapper.selectByExample(userQuery);
        for (User user:userList) {
            System.out.println(user.toString());
        }
        //查询总条数
        long count = userMapper.countByExample(userQuery);
        System.out.println(count);
    }
    @Test
    public void insertUser() throws Exception{
        //插入一条用户数据
        String id = UUID.randomUUID().toString();
        User user = new User();
        user.setId(id);
        user.setLoginName("ht");
        user.setPassword("ht950905");
        user.setUserName("王五");
        user.setSex(0);
        user.setBirthday(DateTimeUtil.convert2String(new Date()));
        user.setEmail("1109394634@qq.com");
        user.setDescription("我是一个很好的人，很好很好的那种那种");
        user.setRegTime(DateTimeUtil.convert2String(new Date()));
        user.setLastTime(DateTimeUtil.convert2String(new Date()));
        userMapper.insert(user);
        System.out.println((User)userMapper.selectByPrimaryKey(id));
    }
    @Test
    public void updateUser() throws Exception{
        *//**
         * 更新要先查出来再更新
         *//*
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andUserNameEqualTo("王五");
        List<User> users = userMapper.selectByExample(userQuery);
        User user = users.get(0);
        user.setUserName("小李子");
        userMapper.updateByPrimaryKey(user);
        *//**
         * 查询出刚插入的记录
         *//*
        UserQuery userQuery1 = new UserQuery();
        userQuery1.createCriteria().andUserNameLike("%小%");
        List<User> userList = userMapper.selectByExample(userQuery1);
        for (User user1:userList) {
            System.out.println(user1);
        }
    }
    @Test
    public void deleteUser() throws Exception{
        //删除一条记录
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andUserNameEqualTo("小张");
        userMapper.deleteByExample(userQuery);
    }
*/
}
