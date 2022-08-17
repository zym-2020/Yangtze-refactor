package njnu.edu.back.controller;

import njnu.edu.back.service.PsqlTilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/21:20
 * @Description:
 */
@RestController
@RequestMapping("/psqlTiles")
public class PsqlTilesController {
    @Autowired
    PsqlTilesService psqlTilesService;

    @CrossOrigin
    @RequestMapping(value = "/{tableName}/{x}/{y}/{z}", method = RequestMethod.GET)
    public Object getVectorTile(@PathVariable String tableName, @PathVariable int x, @PathVariable int y, @PathVariable int z) {
        return psqlTilesService.getVectorTile(tableName, x, y, z);
    }
}
