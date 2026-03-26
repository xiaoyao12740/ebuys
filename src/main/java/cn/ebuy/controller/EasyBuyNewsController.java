package cn.ebuy.controller;


import cn.ebuy.pojo.EasyBuyNews;
import cn.ebuy.service.EasyBuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller

public class EasyBuyNewsController {
@Autowired
    EasyBuyNewsService easyBuyNewsService;
@RequestMapping("/getNewsById")
public String getNewsById(Long newsId, HttpServletRequest request){
    EasyBuyNews easyBuyNews=easyBuyNewsService.queryById(newsId);
    request.setAttribute("easyBuyNews",easyBuyNews);
    /**
     * 最新公告
     */
    EasyBuyNews en1=new EasyBuyNews();
    en1.setEn_type("1");
    List<EasyBuyNews> list1=easyBuyNewsService.queryListByWhere(en1);
    /**
     * 新闻动态
     */
    EasyBuyNews en2=new EasyBuyNews();
    en1.setEn_type("2");
    List<EasyBuyNews> list2=easyBuyNewsService.queryListByWhere(en2);
    request.setAttribute("listGg",list1);
    request.setAttribute("listNews",list2);
    return "new-view";
}


}
