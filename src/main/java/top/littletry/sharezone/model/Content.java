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
public class Content implements Serializable {
    /**
     * 内容ID
     */
    @ApiModelProperty(value = "内容id", hidden = true)
    private String id;
    /**
     * 分享内容标题
     */
    @NotBlank(message = "分享内容标题不能为空")
    @ApiModelProperty(value = "分享内容标题")
    private String title;
    /**
     * 分享内容详细信息
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
    @ApiModelProperty(value = "图片地址")
    private String imageUrl;
    /**
     * 视频地址
     */
    @ApiModelProperty(value = "视频地址")
    private String videoUrl;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "该条分享内容的用户ID")
    private String userId;

    private static final long SERIALIZABLEUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", detail=").append(detail);
        sb.append(", createTime=").append(createTime);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", userId=").append(userId);
        sb.append(", SERIALIZABLEUID=").append(SERIALIZABLEUID);
        sb.append("]");
        return sb.toString();
    }
}