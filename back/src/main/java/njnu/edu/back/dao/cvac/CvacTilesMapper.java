package njnu.edu.back.dao.cvac;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/15/21:57
 * @Description:
 */
@Repository
public interface CvacTilesMapper {
    Object selectTile(@Param("x") int x, @Param("y") int y, @Param("z") int z);
}
