package njnu.edu.back.service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/20:06
 * @Description:
 */
public interface DownloadHistoryService {
    Map<String, Object> pageQuery(int size, int page, String dataListId);
}
