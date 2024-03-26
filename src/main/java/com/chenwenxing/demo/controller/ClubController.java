package com.chenwenxing.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenwenxing.demo.entity.Clubs;
import com.chenwenxing.demo.service.ClubsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClubController {


    @Autowired
    ClubsService clubsService;

    @RequestMapping("/getAllClub")
    @ResponseBody
    public String getAllClub(){
        List<Clubs> allClubs = clubsService.getAllClubs();
        return JSONObject.toJSONString(allClubs);
    }
}
