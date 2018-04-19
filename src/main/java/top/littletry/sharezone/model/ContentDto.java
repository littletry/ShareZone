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
 * @since 2018-04-15
 */
@TableName("content")
public class ContentDto extends Model<ContentDto> {

    private static final long serialVersionUID = 1L;

    /**
     * 内容唯一标识
     */
    @ApiModelProperty(value = "分享内容id",hidden = true)
    private String id;
    /**
     * 分享内容标题
     */
    @NotBlank(message = "分享内容标题不能为空")
    @ApiModelProperty(value = "分享内容标题")
    private String title;
    /**
     * 详细信息
     */
    @ApiModelProperty(value = "分享内容详细信息")
    private String detail;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间",hidden = true)
    private String createTime;
    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址",hidden = true)
    private String imageUrl;
    /**
     * 视频地址
     */
    @ApiModelProperty(value = "视频地址",hidden = true)
    private String videoUrl;
    /**
     * 用户姓名
     */
    @NotBlank(message = "用户Id")
    @ApiModelProperty(value = "用户Id")
    private String userName;
    /**
     * 审核状态
     */
    @ApiModelProperty(value = "审核状态",hidden = true)
    private Integer checkPublish;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCheckPublish() {
        return checkPublish;
    }

    public void setCheckPublish(Integer checkPublish) {
        this.checkPublish = checkPublish;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Content{" +
                ", id=" + id +
                ", title=" + title +
                ", detail=" + detail +
                ", createTime=" + createTime +
                ", imageUrl=" + imageUrl +
                ", videoUrl=" + videoUrl +
                ", userId=" + userName +
                ", checkPublish=" + checkPublish +
                "}";
    }
}
