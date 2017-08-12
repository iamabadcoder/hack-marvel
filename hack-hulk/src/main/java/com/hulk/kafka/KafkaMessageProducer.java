package com.hulk.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Service
public class KafkaMessageProducer implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(KafkaMessageProducer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;
    private Gson gson = new GsonBuilder().create();

    public void sendMessage() {
        KafkaMessageDO kafkaMessageDO = new KafkaMessageDO();
        kafkaMessageDO.setId(System.currentTimeMillis());
        kafkaMessageDO.setMsg(UUID.randomUUID().toString());
        kafkaMessageDO.setSendTime(new Date());
        kafkaTemplate.send("test", gson.toJson(kafkaMessageDO));
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("KafkaMessageProducer start to produce message");
        while (true) {
            Thread.sleep(2000);
            sendMessage();
        }
    }
}

