package com.cn.family.common.util;

import com.cn.family.common.exception.CheckException;

/**
 * 检验工具类 . <br>
 * 
 * @author hkb <br>
 */
public final class CheckUtils {

    /**
     * 私有构造函数
     */
    private CheckUtils() {
        super();
    }

    /**
     * 校验不为空
     * 
     * @param cs
     * @param msgKey
     */
    public static void notEmpty(CharSequence cs, String msgKey) {
        if (cs == null || cs.length() == 0) {
            fail(msgKey);
        }
    }

    /**
     * 校验不为null
     * 
     * @param obj
     * @param msgKey
     */
    public static void notNull(Object obj, String msgKey) {
        if (obj == null) {
            fail(msgKey);
        }
    }

    /**
     * 返回错误信息
     * 
     * @param msgKey
     */
    private static void fail(String msgKey) {
        throw new CheckException(msgKey);
    }

}
