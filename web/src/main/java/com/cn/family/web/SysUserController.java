package com.cn.family.web;

import com.cn.family.aspect.annotation.SysLog;
import com.cn.family.bean.PageResultBean;
import com.cn.family.common.bean.ResultBean;
import com.cn.family.dto.SysUserDTO;
import com.cn.family.entity.SysUserEntity;
import com.cn.family.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统用户controller . <br>
 * 
 * @author hkb <br>
 */
@RestController
public class SysUserController {

    /**
     * 注入用户接口
     */
    @Autowired
    private SysUserService sysUserService;

    /**
     * 插入SysUser到数据库
     * 
     * @param sysUserEntity
     * @return
     */
    @SysLog("新增用户")
    @PostMapping("/sys/addUser")
    public ResultBean<Long> insertSysUser(SysUserEntity sysUserEntity) {
        return new ResultBean<Long>(sysUserService.insertSysUser(sysUserEntity));
    }

    /**
     * 通过SysUser的id更新SysUser中的数据
     * 
     * @param sysUserEntity
     * @return
     */
    @SysLog("修改用户")
    @PutMapping("/sys/updateUser")
    public ResultBean<Long> updateSysUserById(SysUserEntity sysUserEntity) {
        return new ResultBean<Long>(sysUserService.updateSysUserById(sysUserEntity));
    }

    /**
     * 通过SysUser的id删除SysUser
     * 
     * @param userId
     * @return
     */
    @SysLog("删除用户")
    @DeleteMapping("/sys/user/{userId}")
    public ResultBean<Boolean> deleteSysUserById(@PathVariable("userId") Long userId) {
        return new ResultBean<Boolean>(sysUserService.deleteSysUserById(userId));
    }

    /**
     * 通过SysUser的id获得SysUser对象
     * 
     * @param userId
     * @return
     */
    @GetMapping("/sys/user/{userId}")
    public ResultBean<SysUserEntity> selectSysUserById(@PathVariable("userId") Long userId) {
        return new ResultBean<SysUserEntity>(sysUserService.selectSysUserById(userId));
    }

    /**
     * 分页查询SysUser
     * 
     * @param sysUserDTO
     * @return
     */
    @SysLog("查询用户")
    @GetMapping("/sys/user")
    public ResultBean<PageResultBean<SysUserEntity>> selectSysUserByPage(SysUserDTO sysUserDTO) {
        return new ResultBean<PageResultBean<SysUserEntity>>(sysUserService.selectSysUserByPage(sysUserDTO));
    }

}
