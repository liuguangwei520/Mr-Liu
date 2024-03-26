package com.chenwenxing.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Clubs implements Serializable {
    private Integer cid;
    private String cname;
    private String city;
}
