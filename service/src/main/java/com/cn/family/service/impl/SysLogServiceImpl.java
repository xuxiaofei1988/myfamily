package com.cn.family.service.impl;

import com.github.pagehelper.PageHelper;
import com.cn.family.bean.PageResultBean;
import com.cn.family.dao.SysLogDAO;
import com.cn.family.dto.SysLogDTO;
import com.cn.family.entity.SysLogEntity;
import com.cn.family.service.SysLogService;
import com.cn.family.common.util.PageUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统接口实现类 . <br>
 * 
 * @author hkb <br>
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    /**
     * 注入dao
     */
    @Autowired
    private SysLogDAO sysLogDAO;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Long insertSysLog(SysLogEntity sysLogEntity) {
        sysLogDAO.insertSysLog(sysLogEntity);
        return sysLogEntity.getId();
    }

    @Override
    public PageResultBean<SysLogEntity> selectSysLogByPage(SysLogDTO sysLogDTO) {
        PageHelper.startPage(PageUtils.getPageNum(), PageUtils.getPageSize());
        List<SysLogEntity> result = sysLogDAO.selectSysLog(sysLogDTO);
        return new PageResultBean<SysLogEntity>(result);
    }

}