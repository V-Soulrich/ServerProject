package com.huarui.utils;

import org.springframework.util.DigestUtils;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/15 21:49
 * @description ：
 */
public class MD5Util {
    //盐，用于混交md5
    private static final String slat = "&%5123***&&%%$$#@";

    /**
     * 生成md5
     */
    public static String getMD5(String str) {
        String base = str + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex (base.getBytes ());

        return md5;
    }

}
