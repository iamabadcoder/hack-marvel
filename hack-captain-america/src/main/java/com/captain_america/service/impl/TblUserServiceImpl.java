package com.captain_america.service.impl;

import com.captain_america.dataobject.TblUserDO;
import com.captain_america.repository.TblUserRepository;
import com.captain_america.service.TblUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Service
public class TblUserServiceImpl implements TblUserService {

    @Resource
    TblUserRepository tblUserRepository;

    @Override
    public TblUserDO findByUsername(String username) {
        return tblUserRepository.findByUsername(username);
    }

    @Override
    public TblUserDO findByEmail(String email) {
        return tblUserRepository.findByEmail(email);
    }

    @Override
    public TblUserDO findByUsernameAndEmail(String username, String email) {
        return tblUserRepository.findByUsernameAndEmail(username, email);
    }

    @Override
    public List<TblUserDO> findByPassword(String password) {
        return tblUserRepository.findByPassword(password);
    }
}
