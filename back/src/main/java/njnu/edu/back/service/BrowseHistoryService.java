package njnu.edu.back.service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/14:55
 * @Description:
 */
public interface BrowseHistoryService {
    List<Map<String, Object>> getDataGroupByDate(String dataId, int number);
}
