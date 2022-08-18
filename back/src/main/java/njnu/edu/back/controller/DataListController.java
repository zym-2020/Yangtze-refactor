package njnu.edu.back.controller;

import com.alibaba.fastjson2.JSONObject;
import njnu.edu.back.common.result.JsonResult;
import njnu.edu.back.common.result.ResultUtils;
import njnu.edu.back.service.DataListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/11:18
 * @Description:
 */
@RestController
@RequestMapping("/dataList")
public class DataListController {
    @Autowired
    DataListService dataListService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public JsonResult selectAll() {
        return ResultUtils.success(dataListService.selectAll());
    }

    @RequestMapping(value = "/fuzzyQuery", method = RequestMethod.POST)
    public JsonResult fuzzyQuery(@RequestBody JSONObject jsonObject) {
        int page = jsonObject.getIntValue("page");
        int size = jsonObject.getIntValue("size");
        String keyword = jsonObject.getString("keyword");
        String[] tags = jsonObject.getJSONArray("tags").toArray(String.class);
        String property = jsonObject.getString("property");
        Boolean flag = jsonObject.getBoolean("flag");
        return ResultUtils.success(dataListService.fuzzyQuery(page, size, keyword, tags, property, flag));
    }
}
