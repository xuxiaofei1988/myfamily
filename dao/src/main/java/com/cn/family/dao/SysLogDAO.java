package com.cn.family.dao;

import com.cn.family.dto.SysLogDTO;
import com.cn.family.entity.SysLogEntity;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 系统日志dao . <br>
 * 
 * @author hkb <br>
 */
@Component
public interface SysLogDAO {

    /**
     * 插入SysLog到数据库 <br>
     * 
     * 
     * @param sysLogEntity
     * @return
     */
    void insertSysLog(SysLogEntity sysLogEntity);

    /**
     * 获得SysLog数据集合
     * 
     * @param sysLogDTO
     * @return
     */
    List<SysLogEntity> selectSysLog(SysLogDTO sysLogDTO);
}