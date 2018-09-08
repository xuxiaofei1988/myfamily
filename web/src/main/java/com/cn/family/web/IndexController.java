package com.cn.family.web;

import com.cn.family.common.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页controller . <br>
 * 
 * @author hkb <br>
 */
@RestController
public class IndexController {

    @GetMapping("/test")
    public Integer getTest() {
        String string = "12a";
        return StringUtils.stringToInteger(string);
    }

}
