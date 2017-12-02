package top.littletry.sharezone.model;

import java.io.Serializable;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/2
 * Time: 22:08
 *
 * @author LittleTry
 */
public class User implements Serializable{
    private String loginname;
    private String password;
    private String username;
    //公共构造器
    public User() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
