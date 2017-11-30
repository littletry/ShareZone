package top.littletry.sharezone.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 */
@ApiModel(description = "用户请求")
public class User {
    private long id;
    @ApiModelProperty(value = "邮箱",example = "maxTse",position = 1)
    private String email;
    @ApiModelProperty(value = "密码",example = "maxTse",position = 1)
    private String password;
    @ApiModelProperty(value = "姓名",example = "maxTse",position = 1)
    private String username;
    private String role;
    private int status;
    private Date regTime;
    private String regIp;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }
}
