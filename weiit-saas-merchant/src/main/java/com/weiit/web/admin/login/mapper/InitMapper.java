package com.weiit.web.admin.login.mapper;

import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;
import com.weiit.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 数据初始化Mapper
 *
 * @author hzy
 * @version 1.0
 * @date：2017-8-15 下午3:52:46
 * @company http://www.wei-it.com
 */
public interface InitMapper extends BaseMapper {

    E selectShopCert(FormMap formMap);

    void insertCert(FormMap formMap);

    List<E> selectPageList(FormMap formMap);

    void insertShopPayment(FormMap formMap);

    void insertPage(FormMap formMap);

    List<E> selectProtocolList(FormMap formMap);

    void insertProtocol(FormMap formMap);

    List<E> selectPageBottomList(FormMap formMap);

    void insertPageBottom(FormMap formMap);

    List<E> selectPageGlobalList(FormMap formMap);

    void insertPageGlobal(FormMap formMap);

    List<E> selectPageNavsList(FormMap formMap);

    void insertPageNavs(FormMap formMap);

    List<E> selectProductCustomList(FormMap formMap);

    void insertProductCustom(Map formMap);

    List<E> selectProductList(FormMap formMap);

    void insertProduct(Map formMap);

    E selectProductDescOne(FormMap formMap);

    void insertProductDesc(Map formMap);

    List<E> selectProductImagesList(FormMap formMap);

    void insertProductImages(FormMap formMap);

    List<E> selectProductItemList(FormMap formMap);

    void insertProductItem(Map formMap);

    List<E> selectUmpBargainList(FormMap formMap);

    void insertUmpBargain(Map formMap);

    List<E> selectUmpCouponList(FormMap formMap);

    void insertUmpCoupon(Map formMap);

    List<E> selectUmpGrouponList(FormMap formMap);

    void insertUmpGroupon(Map formMap);

    List<E> selectShopExpressList(FormMap formMap);

    void insertShopExpress(FormMap formMap);

}
