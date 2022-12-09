package com.nest.online_complaint_portal.dao;

import com.nest.online_complaint_portal.model.Complaint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComplaintDao extends CrudRepository<Complaint,Integer> {

    @Query(value = "SELECT `id`, `address`, `cpsw`, `email`, `name`, `phone`, `psw`, `uname` FROM `user` WHERE `email`=:email AND `psw`=:psw",nativeQuery = true)
    List<Complaint> login(@Param("email") String email, @Param("psw")String psw);

}
