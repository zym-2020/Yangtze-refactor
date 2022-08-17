package njnu.edu.back.service.impl;

import njnu.edu.back.common.exception.MyException;
import njnu.edu.back.common.result.ResultEnum;
import njnu.edu.back.dao.osm.OsmTilesMapper;
import njnu.edu.back.service.OsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/17:24
 * @Description:
 */
@Service
public class OsmServiceImpl implements OsmService {
    @Autowired
    OsmTilesMapper osmTilesMapper;

    @Override
    public Object selectTile(int x, int y, int z, HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        response.setHeader("Content-Encoding", "gzip");
        return osmTilesMapper.selectTile(x, (int) (Math.pow(2,z) - 1 - y), z);
    }
}
