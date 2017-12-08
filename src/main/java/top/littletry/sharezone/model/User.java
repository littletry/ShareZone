package top.littletry.sharezone.model;


import java.io.Serializable;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 *
 * @author LittleTry
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String loginName;
    private String password;
    private String userName;
    private Integer sex;
    private String birthday;
    private String email;
    private String description;
    private String regTime;
    private String lastTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime == null ? null : regTime.trim();
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", regTime='").append(regTime).append('\'');
        sb.append(", lastTime='").append(lastTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
