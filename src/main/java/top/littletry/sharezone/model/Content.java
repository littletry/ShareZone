package top.littletry.sharezone.model;

import java.io.Serializable;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/7
 * Time: 22:24
 *
 * @author LittleTry
 */
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private String detail;
    private String createTime;
    private String imageUrl;
    private String videoUrl;
    private String userId;

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
        final StringBuffer sb = new StringBuffer("Content{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", detail='").append(detail).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", videoUrl='").append(videoUrl).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
