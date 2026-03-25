package cn.ebuy.controller;

import cn.ebuy.pojo.EasyBuyNews;
import cn.ebuy.pojo.EasyBuyProduct;
import cn.ebuy.pojo.EasyBuyProductCategory;
import cn.ebuy.pojo.EasyBuyUser;
import cn.ebuy.service.EasyBuyNewsService;
import cn.ebuy.service.EasyBuyProductCategoryService;
import cn.ebuy.service.EasyBuyProductService;
import cn.ebuy.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EasyBuyUserController {

    /**
     * 请求打开用户登录页面（地址栏请求的的地址）
     */
    @RequestMapping("/login")
    public String login() {
        /**
         * 到 webapp/WEB-INF/jsp/文件夹件找一个文件名为：login的文件
         */
        return "login2";
    }

    /**
     * 请求打开用户登录页面（地址栏请求的的地址）
     */
    @RequestMapping("/index")
    public String index() {
        /**
         * 到 webapp/WEB-INF/jsp/文件夹件找一个文件名为：login的文件
         */
        return "index";
    }

    @Autowired
    EasyBuyUserService easyBuyUserService;

    @RequestMapping("/doLogin")
    public String doLogin(String userName, String passWord, HttpServletRequest request){
        EasyBuyUser eu = new EasyBuyUser();
        eu.setEu_login_name(userName);
        eu.setEu_password(passWord);
        /**
         *向数据库请求登录操作
         */
        EasyBuyUser easyBuyUser = easyBuyUserService.queryOne(eu);
        if (easyBuyUser == null) {
            request.setAttribute("MSG", "用户名或密码错误");

        } else {
            request.getSession().setAttribute("USERS", easyBuyUser);
            return "redirect:/home";
        }
            return "login2";
        }
        @Autowired
        EasyBuyNewsService easyBuyNewsService;

        @Autowired
        EasyBuyProductService easyBuyProductService;

        @Autowired
        EasyBuyProductCategoryService easyBuyProductCategoryService;

        /**
        * 跳转到主界面
        * @return
         */
        @RequestMapping("/home")
        public String home(HttpServletRequest request){
            /**
             * 最新公告
             */
            EasyBuyNews en1 =new EasyBuyNews();
            en1.setEn_type("1");
            List<EasyBuyNews> list1=easyBuyNewsService.queryListByWhere(en1);
            /**
             * 新闻动态
             */
            EasyBuyNews en2 =new EasyBuyNews();
            en2.setEn_type("2");
            List<EasyBuyNews> list2=easyBuyNewsService.queryListByWhere(en2);
            request.setAttribute("list1",list1);
            request.setAttribute("list2",list2);
            /**
             * 今日特价查询
             */
            List<EasyBuyProduct> listProduct=easyBuyProductService.queryByPage(1,8);
            request.setAttribute("listProduct",listProduct);

            /**
             * 查询热卖推荐
             */
            List<EasyBuyProduct> listRmtj=easyBuyProductService.queryByPage(2,12);

            request.setAttribute("listRmtj",listRmtj);
            /**
             * 商品分类
             */

            /**
             * 查找一级分类
             */
            EasyBuyProductCategory easyBuyProductCategory=new EasyBuyProductCategory();
            easyBuyProductCategory.setEpc_parent_id(0L);

            List<EasyBuyProductCategory> listFirst=easyBuyProductCategoryService.queryListByWhere(easyBuyProductCategory);

            Map<String,List<EasyBuyProductCategory>> mapCategroy=new LinkedHashMap();


            for(EasyBuyProductCategory ep:listFirst){
                /**
                 * 查找二级分类
                 */
                EasyBuyProductCategory easyBuyProductCategory2=new EasyBuyProductCategory();
                easyBuyProductCategory2.setEpc_parent_id(ep.getId());
                List<EasyBuyProductCategory> listSecond=easyBuyProductCategoryService.queryListByWhere(easyBuyProductCategory2);
                mapCategroy.put(ep.getEpc_name(),listSecond);
            }
            request.getSession().setAttribute("mapCategroy",mapCategroy);
            return "index";
            }
            /**
            * 注销
             */
            @RequestMapping("/logout")
            public String logout(HttpServletRequest request){
            request.getSession().removeAttribute("USERS");
            return "redirect:/login";
            }

            /**
            * 请求打开注册页面
            */
            @RequestMapping(value = {"/reg","/toReg","register.html"})
            public String reg(){
             return "reg";
                }
                /**
                * 处理注册请求
                */
                @RequestMapping("/doReg")
                public String doReg(EasyBuyUser easyBuyUser,HttpServletRequest request){
                easyBuyUserService.save(easyBuyUser);
                return "reg-result";
                }





}

