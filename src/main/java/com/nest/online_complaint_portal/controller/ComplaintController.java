package com.nest.online_complaint_portal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ComplaintController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/ureg",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> Ureg(@RequestBody User u){

        dao.save(u);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");

        return map;
    }
}
