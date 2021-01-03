package com.weiit.web.admin.user.service;

import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;
import com.weiit.core.service.BaseService;

import java.util.List;

/**
 * 会员信息Service
 *
 * @version 1.0
 * @author：半个鼠标
 * @date：2018年2月6日
 * @company http://www.wei-it.com 微邦互联
 */
public interface UserService extends BaseService {

    List<E> selectListByUserIds(FormMap formMap);

    List<E> selectUserList(FormMap formMap);

    List<E> selectBalanceList(FormMap formMap);

    List<E> selectAddressList(FormMap formMap);

    List<E> selectIntegralList(FormMap formMap);

    void forbiddenOrOpen(FormMap formMap);

    void forbiddenOrOpenBatch(FormMap formMap);

    void updateBalanceOrIntegralTrans(FormMap formMap);

}
