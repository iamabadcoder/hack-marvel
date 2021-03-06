package com.captain_america.service;

import com.captain_america.dataobject.TblUserDO;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
public interface TblUserService {

    TblUserDO findByUsername(String username);

    TblUserDO findByEmail(String email);

    TblUserDO findByUsernameAndEmail(String username, String email);

    List<TblUserDO> findByPassword(String password);
}
