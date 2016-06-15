/**
 * 
 */
package server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 *
 * 
 * @author: Chris Barrett
 * 
 * @see
 * 
 * @since: Jun 14, 2016
 */
@Controller
public class SpringMVC3Controller {

    @RequestMapping("/hello")
    public String sayHelloToOpenShift() {
	return "hello";
    }
}