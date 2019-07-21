package com.get.depinjection;

import java.security.InvalidParameterException;

public class client {
    private serviceA service;

    public client(){}

    public client(serviceA service){

        if(service == null){
            throw new InvalidParameterException("Service must not be null");
        }

        this.service = service;
    }

    public void greet(){
        service.sendEmail();
    }
}
