package org.redfox.zufun51.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ControllerInterceptor extends HandlerInterceptorAdapter{

	
	public boolean preHandle(HttpServletRequest request,
			              HttpServletResponse response, Object handler) throws Exception{
		System.out.println("访问了："+request.getRequestURI());
		return true;
		
	}
	
	public void postHandle(HttpServletRequest request,
			              HttpServletResponse response, Object handler,
			              ModelAndView modelAndView) throws Exception {
			          System.out.println("ControllerInterceptor.postHandle()");
			      }
	
	public void afterCompletion(HttpServletRequest request,
			              HttpServletResponse response, Object handler, Exception ex)
			              throws Exception {
			          System.out.println("ControllerInterceptor.afterCompletion()");
			      }
	
	
}
