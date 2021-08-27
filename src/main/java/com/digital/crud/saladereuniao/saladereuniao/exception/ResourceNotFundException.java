package com.digital.crud.saladereuniao.saladereuniao.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFund extends Exception{

    private static final Long serialVersionUID= 1l;

    public ResourceNotFund(String message){
        super(message);
    }

}
