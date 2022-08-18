package njnu.edu.back.controller;

import njnu.edu.back.common.result.JsonResult;
import njnu.edu.back.common.result.ResultUtils;
import njnu.edu.back.service.DownloadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/20:11
 * @Description:
 */
@RestController
@RequestMapping("/downloadHistory")
public class DownloadHistoryController {
    @Autowired
    DownloadHistoryService downloadHistoryService;

    @RequestMapping(value = "/pageQuery/{dataListId}/{page}/{size}", method = RequestMethod.GET)
    public JsonResult pageQuery(@PathVariable String dataListId, @PathVariable int page, @PathVariable int size) {
        return ResultUtils.success(downloadHistoryService.pageQuery(size, page, dataListId));
    }
}
