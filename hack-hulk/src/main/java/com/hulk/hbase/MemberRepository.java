package com.hulk.hbase;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
public interface MemberRepository {

    List<MemberDO> findAll();
    MemberDO getByRowKey(String rowKey);

}
