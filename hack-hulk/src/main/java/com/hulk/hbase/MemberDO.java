package com.hulk.hbase;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */

@Data
public class MemberDO implements Serializable{

    private String id;

    private String country;

    private String city;

    private String age;

    private String gener;

    public MemberDO(String country, String city, String age, String gener) {
        this.country = country;
        this.city = city;
        this.age = age;
        this.gener = gener;
    }

    public MemberDO(String id, String country, String city, String age, String gener) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.age = age;
        this.gener = gener;
    }

}
