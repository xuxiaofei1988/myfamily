package com.cn.family.web;

import com.cn.family.bean.PageResultBean;
import com.cn.family.common.bean.ResultBean;
import com.cn.family.dto.SysLogDTO;
import com.cn.family.entity.SysLogEntity;
import com.cn.family.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统日志controller . <br>
 * 
 * @author hkb <br>
 */
@RestController
public class SysLogController {

    /**
     * 注入系统日志接口
     */
    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/sys/log")
    public ResultBean<PageResultBean<SysLogEntity>> selectSysLogByPage(SysLogDTO sysLogDTO) {
        return new ResultBean<PageResultBean<SysLogEntity>>(sysLogService.selectSysLogByPage(sysLogDTO));
    }

}
