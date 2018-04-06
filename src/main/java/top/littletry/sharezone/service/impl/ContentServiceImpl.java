package top.littletry.sharezone.service.impl;

import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.dao.ContentMapper;
import top.littletry.sharezone.service.IContentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
