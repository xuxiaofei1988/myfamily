package com.cn.family.service;

import com.cn.family.bean.PageResultBean;
import com.cn.family.dto.SysLogDTO;
import com.cn.family.entity.SysLogEntity;

/**
 * 系统日志接口 . <br>
 * 
 * @author hkb <br>
 */
public interface SysLogService {

    /**
     * 插入SysLog到数据库 <br>
     * 
     * 
     * @param sysLogEntity
     * @return
     */
    Long insertSysLog(SysLogEntity sysLogEntity);

    /**
     * 获得SysLog数据集合
     * 
     * @param sysLogDTO
     * @return
     */
    PageResultBean<SysLogEntity> selectSysLogByPage(SysLogDTO sysLogDTO);

}