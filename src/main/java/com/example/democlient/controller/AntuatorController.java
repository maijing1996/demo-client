package com.example.democlient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.netty.http.server.HttpServerRequest;

@RestController
public class AntuatorController {

    @GetMapping("/public/test")
    public boolean listInfo(){
//        String localAddr = request.getLocalAddr();
//        String ip = HttpUtil.getClientIP(request);
        return false;
    }


}
