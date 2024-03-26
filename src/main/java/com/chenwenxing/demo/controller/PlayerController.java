package com.chenwenxing.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenwenxing.demo.entity.Players;
import com.chenwenxing.demo.service.ClubsService;
import com.chenwenxing.demo.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PlayerController {

    @Autowired
    PlayersService playersService;

    @Autowired
    ClubsService clubsService;

    @RequestMapping("/getPlayerByCondition")
    public String getPlayerByCondition(String name, Integer cid, Model model){
        List<Players> playersList = playersService.getPlayerByCondition(name, cid);
        model.addAttribute("playersList",playersList);
        model.addAttribute("name",name);
        model.addAttribute("cid",cid);
        return "index";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/addPlayer")
    public String addPlayer(Players players){
        int i = playersService.addPlayer(players);
        if(i>0){
            return "redirect:/getPlayerByCondition";
        }
        return "add";
    }

    @RequestMapping("/delPlayer")
    @ResponseBody
    public String del(Integer id){
        int i = playersService.deleteById(id);
        Map<String,Object> map=new HashMap<>();
        if(i>0){
            map.put("isAdd",1);
        }else {
            map.put("isAdd",0);
        }
        return JSONObject.toJSONString(map);
    }

}
