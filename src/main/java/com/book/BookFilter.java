package com.book;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Lavanya Kondragunta on 11/2/2015.
 */
@Component
@PoweredBy
public class BookFilter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
        Exception {

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            // Test if the controller-method is annotated with @PoweredBy
            PoweredBy filter = handlerMethod.getMethod().getAnnotation(PoweredBy.class);
            if (filter != null) {
                String value= ((PoweredBy)filter).value();
                response.setHeader("X-Powered-By", value);
            }
        }
        return true;
    }
}
