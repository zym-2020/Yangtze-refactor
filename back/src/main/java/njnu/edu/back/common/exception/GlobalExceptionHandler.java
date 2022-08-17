package njnu.edu.back.common.exception;

import njnu.edu.back.common.result.JsonResult;
import njnu.edu.back.common.result.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/15/21:40
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public JsonResult myExceptionHandler(HttpServletRequest req, MyException e) {
        return ResultUtils.fail(e.getCode(), e.getMsg());
    }
}
