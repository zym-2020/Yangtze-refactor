package njnu.edu.back.service;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/17:23
 * @Description:
 */
public interface OsmService {
    Object selectTile(int x, int y, int z, HttpServletResponse response);
}
