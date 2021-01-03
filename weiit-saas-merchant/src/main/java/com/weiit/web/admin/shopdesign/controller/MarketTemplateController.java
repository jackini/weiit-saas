package com.weiit.web.admin.shopdesign.controller;


import com.weiit.core.view.UIview;
import com.weiit.web.base.AdminController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 设计页面
 *
 * @author 半个鼠标
 * @version 1.0
 * @date：2017年2月14日 上午2:01:43
 * @company http://www.wei-it.com
 */
@Controller
@RequestMapping(value = "/design/page")
public class MarketTemplateController extends AdminController {

    public static Logger logger = Logger.getLogger(MarketTemplateController.class);


    @RequestMapping("/marketTemplate")
    public UIview marketTemplate() {
        logger.info("进入 FeatureController-marketTemplate,第三方装修市场");

        UIview result = UIView("/center/design/page/marketTemplate", false);

        return result;
    }

}
