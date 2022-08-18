package njnu.edu.back.service.impl;

import njnu.edu.back.dao.psql.DownloadHistoryMapper;
import njnu.edu.back.service.DownloadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/20:08
 * @Description:
 */
@Service
public class DownloadHistoryServiceImpl implements DownloadHistoryService {
    @Autowired
    DownloadHistoryMapper downloadHistoryMapper;

    @Override
    public Map<String, Object> pageQuery(int size, int page, String dataListId) {
        int total = downloadHistoryMapper.countPageQuery(dataListId);
        List<Map<String, Object>> list = downloadHistoryMapper.pageQuery(size, page * size, dataListId);
        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        result.put("list", list);
        return result;
    }
}
