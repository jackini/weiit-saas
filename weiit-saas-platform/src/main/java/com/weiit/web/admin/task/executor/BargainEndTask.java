package com.weiit.web.admin.task.executor;

import com.weiit.core.entity.FormMap;
import com.weiit.task.core.biz.model.ReturnT;
import com.weiit.task.core.handler.Task;
import com.weiit.task.core.handler.annotation.TaskHandler;
import com.weiit.task.core.log.TaskLogger;
import com.weiit.web.admin.task.service.BargainService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by 罗鸿强 on 2018/7/10.
 * 砍价活动超时失效
 */
@TaskHandler("bargainEndTask")
@Component
public class BargainEndTask extends Task {
    @Resource
    BargainService bargainService;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        TaskLogger.log("砍价活动超时失效");

        FormMap selectMap = new FormMap();
        selectMap.put("state", 0);
        selectMap.put("end_time", new Date());
        selectMap.put("update_state", -1);
        bargainService.edit(selectMap);

        return SUCCESS;
    }
}
