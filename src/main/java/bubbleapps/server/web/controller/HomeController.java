/**
 * 
 */
package bubbleapps.server.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This controller generates the home page
 * 
 * @author: Chris Barrett
 * 
 * @see
 * 
 * @since: Jun 14, 2016
 */
@Controller
@RequestMapping("/")
public class HomeController {

    public static final String WEB_PAGE = "home";

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
	return WEB_PAGE;
    }
}