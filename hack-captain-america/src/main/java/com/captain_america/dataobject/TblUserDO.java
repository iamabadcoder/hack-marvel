package com.captain_america.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Data
public class TblUserDO implements Serializable {

    private static final long serialVersionUID = -8333979623371919708L;

    private Long id;
    private Date createTime;
    private String username;
    private String password;
    private String email;

}
