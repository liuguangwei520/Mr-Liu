package com.chenwenxing.demo.dao;

import com.chenwenxing.demo.entity.Clubs;
import com.chenwenxing.demo.entity.Players;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PlayersDao {

    List<Players> getPlayerByCondition(@Param("name") String name,@Param("cid") Integer cid);

    int addPlayer(Players players);

    int deleteById(Integer id);

}
