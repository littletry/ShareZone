package top.littletry.sharezone.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LittleTry
 * Date: 2017-12-03
 * Time: 上午4:29
 *
 * @author LittLeTry
 */
@Controller
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    @RequestMapping(value = "pathVariableTest/{userId}")
    public void pathVariableTest(@PathVariable Integer userId) {
        logger.info("通过@PathVariable获得数据：" + userId);
    }

    @RequestMapping(value = "requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value = "Accept") String[] accepts) {
        logger.info("通过@RequestHeader获得数据：" + userAgent);
        for (String accept:
                accepts) {
            logger.info(accept);
        }
    }

    @RequestMapping(value = "/cookieValueTest")
    public void cookieValueTest(
            @CookieValue(value = "JSESSIONID",defaultValue = "") String sessionId){
        logger.info("通过@CookieValue获得数据：" + sessionId);
    }
}
