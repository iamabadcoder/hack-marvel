package com.hulk.kafka;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Data
public class KafkaMessageDO implements Serializable {
    /**
     * id
     */
    private Long id;
    /**
     * msg
     */
    private String msg;
    /**
     * sendTime
     */
    private Date sendTime;
}

