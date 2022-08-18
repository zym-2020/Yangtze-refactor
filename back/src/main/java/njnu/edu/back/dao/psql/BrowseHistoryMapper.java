package njnu.edu.back.dao.psql;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/14:53
 * @Description:
 */
@Repository
public interface BrowseHistoryMapper {
    List<Map<String, Object>> getDataGroupByDate(@Param("dataId") String dataId, @Param("date") String date);
}
