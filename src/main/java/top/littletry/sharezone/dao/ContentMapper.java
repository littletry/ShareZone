package top.littletry.sharezone.dao;

import org.apache.ibatis.annotations.Param;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.model.ContentQuery;

import java.util.List;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/7
 * Time: 22:25
 *
 * @author LittleTry
 */
public interface ContentMapper {
    long countByExample(ContentQuery example);

    int deleteByExample(ContentQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(ContentQuery example);

    Content selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentQuery example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentQuery example);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}
