package com.hulk.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Service
public class KafkaMessageConsumer {

    public static Logger logger = LoggerFactory.getLogger(KafkaMessageProducer.class);

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        KafkaMessageDO kafkaMessageDO = gson.fromJson(content, KafkaMessageDO.class);
        logger.info(kafkaMessageDO.toString());
    }
}
