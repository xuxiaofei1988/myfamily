package com.cn.family.dto;

import lombok.Data;

/**
 * 系统日志DTO . <br>
 * 
 * @author hkb <br>
 */
@Data
public class SysLogDTO {

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 用户名
     */
    private String username;

}
