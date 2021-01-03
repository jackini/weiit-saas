package com.weiit.web.admin.publics.service.impl;


import com.weiit.core.mapper.BaseMapper;
import com.weiit.core.service.impl.AbstractService;
import com.weiit.web.admin.publics.mapper.ExcelExportMapper;
import com.weiit.web.admin.publics.service.ExcelExportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Excel管理Service实现类
 *
 * @author 半个鼠标
 * @version 1.0
 * @date：2017-7-5 上午11:46:17
 * @company http://www.wei-it.com
 */
@Service
public class ExcelExportServiceImpl extends AbstractService implements ExcelExportService {

    @Resource
    private ExcelExportMapper excelExportMapper;

    @Override
    public BaseMapper setMapper() {
        return excelExportMapper;
    }


}

