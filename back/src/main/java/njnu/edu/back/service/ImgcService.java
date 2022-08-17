package njnu.edu.back.service;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/11:30
 * @Description:
 */
public interface ImgcService {
    void selectTile(int x, int y, int z, HttpServletResponse response);
}
