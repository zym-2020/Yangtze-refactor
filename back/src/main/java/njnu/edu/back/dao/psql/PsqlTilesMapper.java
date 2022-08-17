package njnu.edu.back.dao.psql;

import njnu.edu.back.pojo.support.TileBox;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/21:08
 * @Description:
 */

@Repository
public interface PsqlTilesMapper {
    Object selectTile(TileBox tileBox);
}
