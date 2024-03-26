package com.chenwenxing.demo.service;

import com.chenwenxing.demo.entity.Players;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayersService {

    List<Players> getPlayerByCondition(@Param("name") String name, @Param("cid") Integer cid);

    int addPlayer(Players players);

    int deleteById(Integer id);
}
