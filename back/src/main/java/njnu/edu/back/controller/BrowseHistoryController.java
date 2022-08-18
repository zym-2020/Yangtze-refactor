package njnu.edu.back.controller;

import njnu.edu.back.common.result.JsonResult;
import njnu.edu.back.common.result.ResultUtils;
import njnu.edu.back.service.BrowseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/14:59
 * @Description:
 */
@RestController
@RequestMapping("/browseHistory")
public class BrowseHistoryController {
    @Autowired
    BrowseHistoryService browseHistoryService;

    @RequestMapping(value = "/getDataGroup/{dataId}/{number}", method = RequestMethod.GET)
    public JsonResult getDataGroup(@PathVariable String dataId, @PathVariable int number) {
        return ResultUtils.success(browseHistoryService.getDataGroupByDate(dataId, number));
    }
}
