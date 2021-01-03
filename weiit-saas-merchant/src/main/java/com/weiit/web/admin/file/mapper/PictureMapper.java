package com.weiit.web.admin.file.mapper;


import com.weiit.core.entity.E;
import com.weiit.core.entity.FormMap;
import com.weiit.core.mapper.BaseMapper;

import java.util.List;

/**
 * 图片空间Mapper
 *
 * @author 半个鼠标
 * @version 1.0
 * @date 2017年2月14日 上午2:12:48
 * @company http://www.wei-it.com
 */
public interface PictureMapper extends BaseMapper {
    int uploadFile(E param);

    List<E> getFileForPage(FormMap formMap);

    List<E> getVideoList(FormMap formMap);

    void insertExpress(FormMap formMap);
}
