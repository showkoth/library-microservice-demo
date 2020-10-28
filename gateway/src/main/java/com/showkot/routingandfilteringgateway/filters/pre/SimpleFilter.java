package com.showkot.routingandfilteringgateway.filters.pre;

import javax.servlet.http.HttpServletRequest;

import com.google.common.io.CharStreams;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SimpleFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);
//  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();

    log.info(String.format("%s request to %s, content length: %s", request.getMethod(), request.getRequestURL().toString(), request.getContentLength()));
    try {
      log.info(String.format("Info : %s , %s ", request.getRequestURL(),
              CharStreams.toString(request.getReader())));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

//  @Override
//  public Object run() throws ZuulException {
//    //getting the current HTTP request that is to be handle
//    HttpServletRequest request= RequestContext.getCurrentContext().getRequest();
//    //printing the detail of the request
//    logger.info("request -> {} requesturi-> {}", request, request.getRequestURI());
//    return null;
//  }

}


//*********************************************

//package com.example.routingandfilteringgateway.filters.pre;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Component
//public class SimpleFilter extends ZuulFilter {
//
//  private Logger logger = LoggerFactory.getLogger(this.getClass());
//  @Override
//  public String filterType() {
//    return null;
//  }
//
//  @Override
//  public int filterOrder() {
//    return 0;
//  }
//
//  @Override
//  public boolean shouldFilter() {
//    return false;
//  }
//
//  @Override
//  public Object run() throws ZuulException {
//    //getting the current HTTP request that is to be handle
//    HttpServletRequest request= RequestContext.getCurrentContext().getRequest();
//    //printing the detail of the request
//    logger.info("request -> {} requesturi-> {}", request, request.getRequestURI());
//    return null;
//  }
//}
