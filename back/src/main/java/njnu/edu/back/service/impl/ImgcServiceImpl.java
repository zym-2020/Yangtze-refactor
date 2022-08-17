package njnu.edu.back.service.impl;

import njnu.edu.back.common.exception.MyException;
import njnu.edu.back.common.result.ResultEnum;
import njnu.edu.back.dao.imgc.ImgcTilesMapper;
import njnu.edu.back.service.ImgcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/11:30
 * @Description:
 */
@Service
public class ImgcServiceImpl implements ImgcService {
    @Autowired
    ImgcTilesMapper imgcTilesMapper;

    @Override
    public void selectTile(int x, int y, int z, HttpServletResponse response) {
        response.setContentType("image/png");
        byte[] result = (byte[]) imgcTilesMapper.selectTile(x, y, z);
        ServletOutputStream sos = null;
        try {
            sos = response.getOutputStream();
            sos.write(result);
            sos.flush();
            sos.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException(ResultEnum.DEFAULT_EXCEPTION);
        } finally {
            try {
                if (sos != null) {
                    sos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new MyException(ResultEnum.DEFAULT_EXCEPTION);
            }
        }
    }
}
