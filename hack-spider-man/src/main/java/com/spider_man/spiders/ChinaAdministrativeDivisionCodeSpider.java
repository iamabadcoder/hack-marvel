package com.spider_man.spiders;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by 曹磊(Hackx) on 13/8/2017.
 * Email: caolei@mobike.com
 */
public class ChinaAdministrativeDivisionCodeSpider {


    public static String targetUrl = "http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html";

    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect(targetUrl).get();
            Element trsPreAppendElement = document.select("div.TRS_PreAppend").first();
            Elements msoNormalElements = trsPreAppendElement.select("p.MsoNormal");
            System.out.println(msoNormalElements.size());
            String firstLevelName = "";
            String secondLevelName = "";
            for (Element msoNormalEle : msoNormalElements){
                if (msoNormalEle.getElementsByTag("b").size() > 0){
                    firstLevelName = msoNormalEle.text().trim().replaceAll(" ", "##");
                }else if("　".equals(msoNormalEle.getElementsByTag("span").first().ownText())){
                    secondLevelName = msoNormalEle.text().trim().replaceAll(" ", "##");
                }else {
                    System.out.println(firstLevelName + "##" + secondLevelName + "##" + msoNormalEle.text().trim().replaceAll(" ", "##"));
                }
            }
        } catch (Exception e) {

        }
    }

}
