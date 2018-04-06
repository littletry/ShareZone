package top.littletry.sharezone.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LittleTry
 * Date: 2017-12-18
 * Time: 11:02
 *
 * @author LittleTry
 */
@ApiModel
public class RestResponse<T> {
    @ApiModelProperty(value = "请求返回code")
    private int code;
    @ApiModelProperty(value = "请求返回的message")
    private String message;
    @ApiModelProperty(value = "请求返回的content")
    private T content;

    public static <T> RestResponse<T> success(T content) {
        RestResponse<T> resp = new RestResponse<T>();
        resp.setCode(0);
        resp.setContent(content);
        return resp;
    }

    public static RestResponse<String> failed(String message) {
        RestResponse<String> resp = new RestResponse<String>();
        resp.setCode(502);
        resp.setMessage(message);
        return resp;
    }

    public static RestResponse<String> success(String message) {
        RestResponse<String> resp = new RestResponse<String>();
        resp.setCode(0);
        resp.setMessage(message);
        return resp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}
