package njnu.edu.back.service;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/15/22:09
 * @Description:
 */
public interface CvacService {
    void selectTile(int x, int y, int z, HttpServletResponse response);
}
