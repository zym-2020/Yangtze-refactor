package njnu.edu.back.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/21:16
 * @Description:
 */
public interface PsqlTilesService {
    Object getVectorTile(String tableName, int x, int y, int z);
}
