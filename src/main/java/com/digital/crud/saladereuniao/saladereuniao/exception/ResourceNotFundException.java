package com.digital.crud.saladereuniao.saladereuniao.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFundException extends Exception{

    private static final Long serialVersionUID= 1l;

    public ResourceNotFundException(String message){
        super(message);
    }

}
