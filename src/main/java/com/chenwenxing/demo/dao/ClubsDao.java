package com.chenwenxing.demo.dao;

import com.chenwenxing.demo.entity.Clubs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ClubsDao {

    List<Clubs> getAllClubs();

}
