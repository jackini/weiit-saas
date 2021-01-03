package com.weiit.web.admin.user.service;

import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;
import com.weiit.core.service.BaseService;

import java.util.List;


/**
 * 会员标签组管理Service
 *
 * @version 1.0
 * @author：半个鼠标
 * @date：2018年2月6日
 * @company http://www.wei-it.com 微邦互联
 */
public interface UserSignService extends BaseService {

    /**
     * 给会员打标签
     *
     * @param formMap
     */
    void insertSignLog(FormMap formMap);

    /**
     * 查询会员属于哪些标签组,查询其名称
     *
     * @param formMap
     * @return
     */
    List<E> selectSignNameListByUserId(FormMap formMap);

    /**
     * 查询会员信息，根据signids
     *
     * @param formMap
     * @return
     */
    List<E> selectUserListBySignIds(FormMap formMap);
}

