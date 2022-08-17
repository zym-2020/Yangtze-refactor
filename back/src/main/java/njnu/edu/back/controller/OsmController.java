package njnu.edu.back.controller;

import njnu.edu.back.service.OsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/17:25
 * @Description:
 */
@RestController
@RequestMapping("/osm")
public class OsmController {
    @Autowired
    OsmService osmService;

    @CrossOrigin
    @RequestMapping(value = "/selectTile/{z}/{x}/{y}", method = RequestMethod.GET)
    public Object selectTile(@PathVariable int z, @PathVariable int x, @PathVariable int y, HttpServletResponse response) {
        return osmService.selectTile(x, y, z, response);
    }
}
