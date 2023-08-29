/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.calcu;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public String Addition(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        float res;
        res=a+b;
        return Float.toString(res);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Substraction")
    public String Substraction(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        float res;
        res=a-b;
        return Float.toString(res);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplication")
    public String Multiplication(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        float res;
        res=a*b;
        return Float.toString(res);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public String Division(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        float res;
        res=a/b;
        return Float.toString(res);

    

    /**
     * This is a sample web service operation
     */
    
}
