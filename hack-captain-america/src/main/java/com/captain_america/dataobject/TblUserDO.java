package com.captain_america.dataobject;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Data
@Entity
@Table(name = "tbl_user")
public class TblUserDO implements Serializable {
    private static final long serialVersionUID = -8333979623371919708L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, name = "create_time")
    private Date createTime;
    @Column(nullable = false, name = "username")
    private String username;
    @Column(nullable = false, name = "password")
    private String password;
    @Column(nullable = false, name = "email")
    private String email;
}

