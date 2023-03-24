package top.xmlsj.signin.wangyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.xmlsj.signin.wangyi.domain.entity.MusicUser;

/**
 * Created on 2023/3/23.
 *
 * @author Yang YaoWei
 */
@Mapper
public interface MusicUserMapper extends BaseMapper<MusicUser> {

    void truncateTable();
}
