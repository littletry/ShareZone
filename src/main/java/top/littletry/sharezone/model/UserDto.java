package top.littletry.sharezone.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@TableName("user")
public class UserDto {

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
     * 用户性别（男0女1保密2）
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


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "User{" +
                ", loginName=" + loginName +
                ", password=" + password +
                ", userName=" + userName +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", email=" + email +
                ", description=" + description +
                "}";
    }
}
