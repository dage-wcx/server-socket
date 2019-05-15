package com.serversocket.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName AccountUtils
 * @Description
 * @Author wcx
 * @Date 2019/05/05 14:07
 * @Version
 **/
public class AccountUtils {

    public static Long getAccount() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMdHms");
        return Long.parseLong(sdf.format(d));
    }
}
