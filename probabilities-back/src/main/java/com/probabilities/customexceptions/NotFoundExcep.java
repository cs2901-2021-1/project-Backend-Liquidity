package com.probabilities.customexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundExcep extends RuntimeException{
    public NotFoundExcep(){
        super();
    }

}
