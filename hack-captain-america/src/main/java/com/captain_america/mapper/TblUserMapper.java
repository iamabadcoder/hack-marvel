package com.captain_america.mapper;

import com.captain_america.dataobject.TblUserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Mapper
public interface TblUserMapper {
    TblUserDO queryById(@Param("id") Long id);
}
