package njnu.edu.back.dao.psql;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/11:05
 * @Description:
 */
@Repository
public interface DataListMapper {
    Map<String, Object> selectAll();

    List<Map<String, Object>> fuzzyQuery(@Param("start") int start, @Param("size") int size, @Param("keyword") String keyword, @Param("tags") String[] tags, @Param("property") String property, @Param("flag") Boolean flag);

    int countFuzzyQuery(@Param("keyword") String keyword, @Param("tags") String[] tags);
}
