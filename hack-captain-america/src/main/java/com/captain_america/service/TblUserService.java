package com.captain_america.service;

import com.captain_america.dataobject.TblUserDO;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
public interface TblUserService {
    TblUserDO queryById(Long id);
}
