package com.chenwenxing.demo.service;

import com.chenwenxing.demo.entity.Clubs;
import com.chenwenxing.demo.entity.Players;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClubsService {


    List<Clubs> getAllClubs();
}
