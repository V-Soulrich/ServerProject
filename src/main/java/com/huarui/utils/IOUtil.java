package com.huarui.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 9:58
 * @description ：
 */
public class IOUtil {
    public static void returnResponse(HttpServletResponse response, JSON returnJSON) {
        response.setContentType ("application/json");
        PrintWriter out = null;

        try {
            String returnContent = returnJSON.toString ();
            System.out.println (returnContent);
            out = response.getWriter ();
            out.write (returnContent.toString ());
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            out.flush ();
            out.close ();
        }
    }
}
