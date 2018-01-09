package top.littletry.sharezone.model;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2018/1/9
 * Time: 22:41
 *
 * @author LittleTry
 */
public class User implements Serializable {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户id",hidden = true)
    private String id;
    /**
     * 登录用户名
     */
    @NotBlank(message = "登录用户名不能为空")
    @ApiModelProperty(value = "登录用户名")
    private String loginName;
    /**
     * 用户密码
     */
    @NotBlank(message = "用户登录密码不能为空")
    @ApiModelProperty(value = "用户登录密码")
    private String password;
    /**
     * 用户姓名
     */
    @NotBlank(message = "用户姓名不能为空")
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    /**
     * 用户性别
     */
    @ApiModelProperty(value = "用户性别")
    private Integer sex;
    /**
     * 用户生日
     */
    @ApiModelProperty(value = "用户生日")
    private String birthday;
    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;
    /**
     * 用户个性描述信息
     */
    @ApiModelProperty(value = "用户个性描述信息")
    private String description;
    /**
     * 用户注册时间
     */
    @ApiModelProperty(value = "用户注册时间",hidden = true)
    private String regTime;
    /**
     * 用户最后一次登录时间
     */
    @ApiModelProperty(value = "用户最后一次登录时间",hidden = true)
    private String lastTime;

    private static final long SERIALIZABLEUID = 1L;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", userName=").append(userName);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", email=").append(email);
        sb.append(", description=").append(description);
        sb.append(", regTime=").append(regTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", SERIALIZABLEUID").append(SERIALIZABLEUID);
        sb.append("]");
        return sb.toString();
    }
}





















