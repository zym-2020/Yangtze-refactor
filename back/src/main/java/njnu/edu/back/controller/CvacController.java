package njnu.edu.back.controller;

import njnu.edu.back.service.CvacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/15/22:11
 * @Description:
 */
@RestController
@RequestMapping("/cvac")
public class CvacController {
    @Autowired
    CvacService cvacService;

    @CrossOrigin
    @RequestMapping(value = "/selectTile/{x}/{y}/{z}", method = RequestMethod.GET)
    public void selectTile(@PathVariable int x, @PathVariable int y, @PathVariable int z, HttpServletResponse response) {
        cvacService.selectTile(x, y, z, response);
    }
}
