package com.myworld.microservices.apigatewayservice;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * Logging fiter
 * 
 * @author Jegatheesh <br>
 * 		Created on 19-Jul-2019
 *
 */
@Component
public class APILoggingFilter extends ZuulFilter {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		// We can check conditions to enable/disable filter
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		LOGGER.info("Request URI -> {}", request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	/* 
	 * If multiple filter in Gateway, we can specify order here
	 * 
	 * @see com.netflix.zuul.ZuulFilter#filterOrder()
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

}
