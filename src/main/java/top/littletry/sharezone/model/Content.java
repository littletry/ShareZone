package top.littletry.sharezone.model;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
public class Content extends Model<Content> {

    private static final long serialVersionUID = 1L;

    /**
     * 内容唯一标识
     */
    private String id;
    /**
     * 分享内容标题
     */
    private String title;
    /**
     * 详细信息
     */
    private String detail;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 图片地址
     */
    private String imageUrl;
    /**
     * 视频地址
     */
    private String videoUrl;
    /**
     * 用户Id
     */
    private String userId;


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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        ", userId=" + userId +
        "}";
    }
}
