package com.chinadaas.platform.bi.server.filter;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xie on 16/7/26.
 */
@Component
public class CrossDomainSupportFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, X-Requested-With");
        response.addHeader("Access-Control-Allow-Methods", "DELETE,POST,PUT,GET");
        filterChain.doFilter(servletRequest, response);
    }

    @Override
    public void destroy() {

    }

    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CrossDomainSupportFilter());
        registration.addUrlPatterns("/*");
        registration.setName("crossDomainSupportFilter");
        return registration;
    }
}
