package njnu.edu.back.service.impl;

import njnu.edu.back.common.utils.TileUtil;
import njnu.edu.back.dao.psql.PsqlTilesMapper;
import njnu.edu.back.pojo.support.TileBox;
import njnu.edu.back.service.PsqlTilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/21:17
 * @Description:
 */
@Service
public class PsqlTilesServiceImpl implements PsqlTilesService {
    @Autowired
    PsqlTilesMapper psqlTilesMapper;

    @Override
    public Object getVectorTile(String tableName, int x, int y, int z) {
        TileBox tileBox = TileUtil.tile2boundingBox(x, y, z, tableName);
        Object result = psqlTilesMapper.selectTile(tileBox);
        return result;
    }
}
