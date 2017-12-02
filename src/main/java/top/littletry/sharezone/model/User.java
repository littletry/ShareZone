package top.littletry.sharezone.model;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/2
 * Time: 22:08
 *
 * @author LittleTry
 */
public class User {
    private String loginname;
    private String password;
    private String username;

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
