/**
 * 
 */
package bubbleapps.server.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Configures the web controllers
 * 
 * @author: Chris Barrett
 * 
 * @see WebMvcConfigurerAdapter
 * 
 * @since: Jun 15, 2016
 */
@Configuration
@EnableWebMvc
@ComponentScan("bubbleapps.server.web")
public class WebConfiguration {

    public static final String PREFIX = "/WEB-INF/views/";
    public static final String SUFFIX = ".jsp";

    @Bean
    public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix(PREFIX);
	viewResolver.setSuffix(SUFFIX);
	return viewResolver;
    }

}
