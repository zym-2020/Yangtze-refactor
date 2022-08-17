package njnu.edu.back.dao.osm;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/17:09
 * @Description:
 */
@Repository
public interface OsmTilesMapper {
    Object selectTile(@Param("x") int x, @Param("y") int y, @Param("z") int z);
}
