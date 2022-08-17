package njnu.edu.back.controller;

import njnu.edu.back.service.ImgcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/11:33
 * @Description:
 */
@RestController
@RequestMapping("/imgc")
public class ImgcController {
    @Autowired
    ImgcService imgcService;

    @CrossOrigin
    @RequestMapping(value = "/selectTile/{x}/{y}/{z}", method = RequestMethod.GET)
    public void selectTile(@PathVariable int x, @PathVariable int y, @PathVariable int z, HttpServletResponse response) {
        imgcService.selectTile(x, y, z, response);
    }
}
