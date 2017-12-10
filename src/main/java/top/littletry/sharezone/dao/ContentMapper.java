package top.littletry.sharezone.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.model.ContentQuery;

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