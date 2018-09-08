package com.cn.family.handler;

import com.cn.family.common.bean.ResultBean;
import com.cn.family.common.exception.CheckException;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常控制器 .<br>
 * 
 * @author hkb <br>
 */
@RestControllerAdvice
@SuppressWarnings("rawtypes")
public class GlobalExceptionHandler {

    /**
     * 日志对象
     */
    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 校验异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(CheckException.class)
    public ResultBean checkExceptionHandler(CheckException e) {
        log.error(e.getMessage(), e);
        ResultBean result = new ResultBean();
        result.setCode(ResultBean.CHECK_FAIL);
        result.setMsg(e.getMessage());
        return result;
    }

    /**
     * 未知异常
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultBean exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        ResultBean result = new ResultBean();
        result.setCode(ResultBean.UNKNOWN_EXCEPTION);
        result.setMsg("未知异常,异常信息: " + e.getMessage());
        return result;
    }

    /**
     * IO异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(IOException.class)
    public ResultBean ioExceptionHandler(IOException e) {
        log.error(e.getMessage(), e);
        ResultBean result = new ResultBean();
        result.setCode(ResultBean.CHECK_FAIL);
        result.setMsg("IO流异常,异常信息: " + e.getMessage());
        return result;
    }

}
