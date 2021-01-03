package com.weiit.web.api.mapper;


import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;
import com.weiit.core.mapper.BaseMapper;

import java.util.List;

/**
 * 登录相关Mapper
 *
 * @version 1.0
 * @author：半个鼠标
 * @date：2018年3月14日
 * @company http://www.wei-it.com 微邦互联
 */
public interface PlatformMapper extends BaseMapper {

    /**
     * 发送验证码
     *
     * @param formMap
     * @return
     */
    boolean sendMobileMsg(FormMap formMap);

    /**
     * 用户账号登录
     *
     * @param formMap
     * @return 用户信息
     */
    E login(FormMap formMap);

    /**
     * 用户微信登录
     *
     * @param formMap
     * @return 用户信息
     */
    E weixinLogin(FormMap formMap);

    /**
     * 用户注册
     *
     * @param formMap
     */
    void register(FormMap formMap);

    /**
     * 根据店铺域名查询店铺信息
     *
     * @param formMap
     * @return
     */
    E selectShopInfoByShopDomainPrex(FormMap formMap);

    /**
     * 查询店铺所绑定的公众号信息
     *
     * @param formMap
     * @return
     */
    E selectWeixinPublicInfoByShopId(FormMap formMap);

    /**
     * 根据appid查询店铺所绑定的公众号信息
     *
     * @param formMap
     * @return
     */
    E selectWeixinPublicInfoByAppId(FormMap formMap);

    E selectUserAndAuthInfoByUserId(FormMap formMap);

    E getPayInfoByOpenId(FormMap formMap);

    int insertExpress(FormMap formMap);

    List<E> getArea(FormMap formMap);


    E selectBlogInfoById(FormMap formMap);

    E selectShopTemplateMsg(FormMap formMap);

    E selectShopInfoById(FormMap formMap);

    E selectShopIntroPage(FormMap formMap);

    void saveIntroPage(FormMap formMap);


}
