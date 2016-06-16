/**
 * 
 */
package bubbleapps.server.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configures non Spring MVC Components
 * 
 * @author: Chris Barrett
 * 
 * @see
 * 
 * @since: Jun 15, 2016
 */
@Configuration
@ComponentScan(basePackages = { "bubbleapps" }, excludeFilters = {
	@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfiguration {

}
