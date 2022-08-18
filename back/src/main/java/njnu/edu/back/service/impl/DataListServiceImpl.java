package njnu.edu.back.service.impl;

import njnu.edu.back.dao.psql.DataListMapper;
import njnu.edu.back.service.DataListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/11:16
 * @Description:
 */
@Service
public class DataListServiceImpl implements DataListService {
    @Autowired
    DataListMapper dataListMapper;

    @Override
    public Map<String, Object> selectAll() {
        return dataListMapper.selectAll();
    }

    @Override
    public Map<String, Object> fuzzyQuery(int page, int size, String keyword, String[] tags, String property, Boolean flag) {
        if(!keyword.equals("")) {
            keyword = "%" + keyword + "%";
        }
        int total = dataListMapper.countFuzzyQuery(keyword, tags);

        List<Map<String, Object>> list = dataListMapper.fuzzyQuery(size * page, size, keyword, tags, property, flag);
        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        result.put("list", list);
        return result;
    }
}
