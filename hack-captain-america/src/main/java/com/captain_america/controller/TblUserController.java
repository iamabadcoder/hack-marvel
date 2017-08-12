package com.captain_america.controller;

import com.captain_america.dataobject.TblUserDO;
import com.captain_america.service.TblUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */
@Controller
public class TblUserController {

    public static Logger logger = LoggerFactory.getLogger("captainAmericaLogger");

    @Resource
    TblUserService tblUserService;


    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        logger.info("request index page by someone~~");
        model.put("current_time", new Date());
        return "index";
    }

    @RequestMapping("/user-detail")
    public String userDetail(Map<String, Object> model) {
        TblUserDO tblUserDO = tblUserService.queryById(1L);
        model.put("current_time", new Date());
        model.put("user_detail", tblUserDO);
        return "user-detail";
    }


}
