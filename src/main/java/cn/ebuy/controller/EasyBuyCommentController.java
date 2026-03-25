package cn.ebuy.controller;


import cn.ebuy.pojo.EasyBuyComment;
import cn.ebuy.service.EasyBuyCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class EasyBuyCommentController {
    @Autowired
    EasyBuyCommentService easyBuyCommentService;
    @RequestMapping("/guestbook.html")
    public String guestbook(HttpServletRequest request){
        List<EasyBuyComment> list=easyBuyCommentService.queryAll();
        request.setAttribute("list",list);
        return "comment";
    }
    @RequestMapping("/saveComment")
    public String saveComment(EasyBuyComment easyBuyComment,HttpServletRequest request){

        easyBuyComment.setEc_create_time(new Date());
        easyBuyCommentService.save(easyBuyComment);

        return "redirect:/guestbook.html";
    }
}
