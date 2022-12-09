package com.nest.online_complaint_portal.controller;

import com.nest.online_complaint_portal.dao.ComplaintDao;
import com.nest.online_complaint_portal.model.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ComplaintController {

    @Autowired
    private ComplaintDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/ureg",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> Ureg(@RequestBody Complaint u){

        dao.save(u);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");

        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userLogin", produces = "application/json", consumes = "application/json")
    public HashMap<String, String> UserLogin(@RequestBody Complaint u)
    {
        System.out.println(u.getEmail());
        System.out.println(u.getPsw());
        List<Complaint> result = (List<Complaint>) dao.login(u.getEmail(), u.getPsw());
        HashMap<String, String> st = new HashMap<>();
        if (result.size() == 0)
        {
            st.put("status", "failed");
            st.put("message", "user doesn't exist");
        } else
        {
            int id = result.get(0).getId();
            st.put("userId", String.valueOf(id));
            st.put("status", "success");
            st.put("message", "d");
        }

        return st;
    }

}
