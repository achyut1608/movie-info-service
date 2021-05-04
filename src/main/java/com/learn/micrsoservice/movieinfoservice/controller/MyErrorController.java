package com.learn.micrsoservice.movieinfoservice.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

public class MyErrorController{}

//@Controller
/*public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        Object statusCode =  request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        System.out.println("Status code : "+statusCode);
        if(statusCode != null)
        {
            Integer code  = Integer.valueOf(statusCode.toString());
            if(code == HttpStatus.NOT_FOUND.value()) {
                System.out.println("resource not found");
                return "error-404";
            }if(code==HttpStatus.BAD_REQUEST.value())
                return "error-400";
            else if(code==HttpStatus.UNAUTHORIZED.value())
                return "error-401";
            else if(code==HttpStatus.FORBIDDEN.value())
                return "error-403";
            else if(code==HttpStatus.NOT_IMPLEMENTED.value())
                return "error-500";
            else if(code==HttpStatus.BAD_GATEWAY.value())
                return "error-502";
            else
                return "error-unknown";
        } else
            return "/error";

    }


    @Override
    public String getErrorPath() {

        return null;
    }

}
*/

