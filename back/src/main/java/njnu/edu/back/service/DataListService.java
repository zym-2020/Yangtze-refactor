package njnu.edu.back.service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/11:16
 * @Description:
 */
public interface DataListService {
    Map<String, Object> selectAll();

    Map<String, Object> fuzzyQuery(int page, int size, String keyword, String[] tags, String property, Boolean flag);
}
