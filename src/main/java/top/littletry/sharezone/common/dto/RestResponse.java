package top.littletry.sharezone.common.dto;

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
    @ApiModelProperty(value = "请求是否成功")
    private boolean success;
    @ApiModelProperty(value = "请求失败返回的消息")
    private String message;
    @ApiModelProperty(value = "请求返回的数据内容")
    private T data;

    public static <T> RestResponse<T> success(T data) {
        RestResponse<T> resp = new RestResponse<T>();
        resp.setSuccess(true);
        resp.setData(data);
        return resp;
    }

    public static RestResponse<String> failed(String message) {
        RestResponse<String> resp = new RestResponse<String>();
        resp.setSuccess(false);
        resp.setData(message);
        return resp;
    }

    public static RestResponse<String> success() {
        RestResponse<String> resp = new RestResponse<String>();
        resp.setSuccess(true);
        return resp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
