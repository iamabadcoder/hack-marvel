package com.captain_america.repository;

import com.captain_america.dataobject.TblUserDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
public interface TblUserRepository extends JpaRepository<TblUserDO, Long> {

    TblUserDO findByUsername(String username);

    TblUserDO findByEmail(String email);

    TblUserDO findByUsernameAndEmail(String username, String email);

    List<TblUserDO> findByPassword(String password);

}
