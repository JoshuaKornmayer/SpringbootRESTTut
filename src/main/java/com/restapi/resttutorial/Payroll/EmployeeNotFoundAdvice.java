package com.restapi.resttutorial.Payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody
    // Signals that this advice is rendered strauight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class)
    // configures the advice to only respond if an employeenotfoundexception is
    // thrown
    @ResponseStatus(HttpStatus.NOT_FOUND)
    // says to issue an HttpStatus.NOT_FOUND http 404
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}