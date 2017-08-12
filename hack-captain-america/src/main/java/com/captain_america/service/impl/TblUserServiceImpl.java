package com.captain_america.service.impl;

import com.captain_america.dataobject.TblUserDO;
import com.captain_america.mapper.TblUserMapper;
import com.captain_america.service.TblUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Service
public class TblUserServiceImpl implements TblUserService {

    @Resource
    TblUserMapper tblUserMapper;

    @Override
    public TblUserDO queryById(Long id) {
        // TODO 参数校验
        return tblUserMapper.queryById(id);
    }
}
