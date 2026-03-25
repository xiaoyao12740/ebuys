package cn.ebuy.controller;


import cn.ebuy.pojo.EasyBuyProduct;
import cn.ebuy.pojo.EasyBuyProductDesc;
import cn.ebuy.service.EasyBuyProductDescService;
import cn.ebuy.service.EasyBuyProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EasyBuyProductController {
    @Autowired
    EasyBuyProductService easyBuyProductService;
    @Autowired
    EasyBuyProductDescService easyBuyProductDescService;
    @RequestMapping("/product-view")
    public  String productView(Long id, HttpServletRequest request){
        /**
         * 查询商品信息
         */
        EasyBuyProduct easyBuyProduct=easyBuyProductService.queryById(id);
        /**
         * 查询商品详情
         */
        EasyBuyProductDesc easyBuyProductDesc=easyBuyProductDescService.queryById(id);
        request.setAttribute("product",easyBuyProduct);
        request.setAttribute("productDesc",easyBuyProductDesc);
        return "product-view";
    }
    @RequestMapping("selectProductByCategory")

    public  String selectProductByCatgory(Long eid, @RequestParam(name="page",defaultValue = "1",required = false) int page, HttpServletRequest request){
        /**
         * 根据商品分类，查询商品信息
         */
        EasyBuyProduct easyBuyProduct=new EasyBuyProduct();
        easyBuyProduct.setEpc_id(eid);
        PageHelper.startPage(page,12);
        List<EasyBuyProduct> list=easyBuyProductService.queryListByWhere(easyBuyProduct);
        PageInfo<EasyBuyProduct> pageInfo=new PageInfo<>(list);
        request.setAttribute("pageInfo",pageInfo);
        return "product-list";
    }
}
