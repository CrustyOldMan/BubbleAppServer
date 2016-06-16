/**
 * 
 */
package bubbleapps.server.web.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Initializer for the web app
 * 
 * @author: Chris Barrett
 * 
 * @see AbstractAnnotationConfigDispatcherServletInitializer
 * 
 * @since: Jun 15, 2016
 */
public class

BubbleInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.servlet.support.
     * AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses
     * ()
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] { WebConfiguration.class };
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.servlet.support.
     * AbstractAnnotationConfigDispatcherServletInitializer#
     * getServletConfigClasses()
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.servlet.support.
     * AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
	return new String[] { "/" };
    }

}
