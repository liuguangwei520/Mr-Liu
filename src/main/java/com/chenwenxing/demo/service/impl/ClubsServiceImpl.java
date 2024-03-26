package com.chenwenxing.demo.service.impl;

import com.chenwenxing.demo.dao.ClubsDao;
import com.chenwenxing.demo.entity.Clubs;
import com.chenwenxing.demo.entity.Players;
import com.chenwenxing.demo.service.ClubsService;
import com.chenwenxing.demo.tool.RedisTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
public class ClubsServiceImpl implements ClubsService {

    @Autowired
    ClubsDao clubsDao;

    @Autowired
    RedisTool redisTool;

    @Override
    public List<Clubs> getAllClubs() {
        List<Clubs> clubs = (List<Clubs>) redisTool.getValue("clubs");
        if(!StringUtils.isEmpty(clubs)){
            return clubs;
        }
        List<Clubs> allClubs = clubsDao.getAllClubs();
        redisTool.setValue("clubs",allClubs);
        return allClubs;
    }
}
