/**
 * 
 */
package bubbleapps.server.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the home page
 * 
 * @author: Chris Barrett
 * 
 * @since: Jun 14, 2016
 */
@Controller
@RequestMapping({ "/", "/homepage" })
public class HomeController {

    public static final String WEB_PAGE = "home";

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
	System.out.println("sayHello");
	model.addAttribute("greeting", "I can see you!");
	return WEB_PAGE;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
	model.addAttribute("greeting", "I can see you here, too!");
	return WEB_PAGE;
    }
}