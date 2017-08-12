package com.hulk.hbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.stereotype.Repository;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private static final Logger logger = LoggerFactory.getLogger(MemberRepositoryImpl.class);

    @Autowired
    private HbaseTemplate hbaseTemplate;

    private String tableName = "member";
    private byte[] tableNameAsBytes = Bytes.toBytes("member");

    public static byte[] addressColumnFamilyAsBytes = Bytes.toBytes("address");
    public static byte[] infoColumnFamilyAsBytes = Bytes.toBytes("info");

    private byte[] countryAsBytes = Bytes.toBytes("country");
    private byte[] cityAsBytes = Bytes.toBytes("city");
    private byte[] ageAsBytes = Bytes.toBytes("age");
    private byte[] genderAsBytes = Bytes.toBytes("gender");


    @Override
    public List<MemberDO> findAll() {
        logger.info("find all member from habse");
        return hbaseTemplate.find(tableName, "info", new RowMapper<MemberDO>() {
            @Override
            public MemberDO mapRow(Result result, int rowNum) throws Exception {
                return new MemberDO(Bytes.toString(result.getValue(addressColumnFamilyAsBytes, countryAsBytes)),
                        Bytes.toString(result.getValue(addressColumnFamilyAsBytes, cityAsBytes)),
                        Bytes.toString(result.getValue(infoColumnFamilyAsBytes, ageAsBytes)),
                        Bytes.toString(result.getValue(infoColumnFamilyAsBytes, genderAsBytes)));
            }
        });
    }

    @Override
    public MemberDO getByRowKey(String rowKey) {
        logger.info("get from habse by rowkey");
        return hbaseTemplate.get(tableName, rowKey, new RowMapper<MemberDO>() {
            @Override
            public MemberDO mapRow(Result result, int rowNum) throws Exception {
                return new MemberDO(rowKey,
                        Bytes.toString(result.getValue(addressColumnFamilyAsBytes, countryAsBytes)),
                        Bytes.toString(result.getValue(addressColumnFamilyAsBytes, cityAsBytes)),
                        Bytes.toString(result.getValue(infoColumnFamilyAsBytes, ageAsBytes)),
                        Bytes.toString(result.getValue(infoColumnFamilyAsBytes, genderAsBytes)));
            }

        });
    }
}

