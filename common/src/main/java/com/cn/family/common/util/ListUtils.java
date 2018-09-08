package com.cn.family.common.util;

import java.util.Collection;

/**
 * 集合工具类 . <br>
 * 
 * @author hkb <br>
 */
public final class ListUtils {

    /**
     * 私有构造函数
     */
    private ListUtils() {
        super();
    }

    /**
     * 判空
     * 
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    /**
     * 判断不为空
     * 
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

}
