package njnu.edu.back.dao.imgc;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/11:29
 * @Description:
 */
@Repository
public interface ImgcTilesMapper {
    Object selectTile(@Param("x") int x, @Param("y") int y, @Param("z") int z);
}
