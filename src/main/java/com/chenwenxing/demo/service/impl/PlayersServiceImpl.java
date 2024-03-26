package com.chenwenxing.demo.service.impl;

import com.chenwenxing.demo.dao.PlayersDao;
import com.chenwenxing.demo.entity.Clubs;
import com.chenwenxing.demo.entity.Players;
import com.chenwenxing.demo.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayersServiceImpl implements PlayersService {

    @Autowired
    PlayersDao playersDao;


    @Override
    public List<Players> getPlayerByCondition(String name, Integer cid) {
        return playersDao.getPlayerByCondition(name,cid);
    }

    @Override
    public int addPlayer(Players players) {
        return playersDao.addPlayer(players);
    }

    @Override
    public int deleteById(Integer id) {
        return playersDao.deleteById(id);
    }
}
