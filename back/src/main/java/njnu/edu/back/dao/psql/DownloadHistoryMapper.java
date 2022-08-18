package njnu.edu.back.dao.psql;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/19:57
 * @Description:
 */
@Repository
public interface DownloadHistoryMapper {
    List<Map<String, Object>> pageQuery(@Param("size") int size, @Param("start") int start, @Param("dataListId") String dataListId);

    int countPageQuery(@Param("dataListId") String dataListId);
}
