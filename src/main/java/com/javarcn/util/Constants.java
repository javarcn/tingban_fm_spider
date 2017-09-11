package com.javarcn.util;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class Constants {
    public static final String CATEGORY_URL = "http://www.tingban.cn/webapi/category/list";
    public static final String GET_FM_URL = "http://www.tingban.cn/webapi/resource/search?cid=%d&rtype=20000&sorttype=HOT_RANK_DESC&pagesize=24&pagenum=%d";//cid pagenum
    public static final String FM_PATH = "d:/music/fm.txt";
    public static final String COUNTRY_FM = "http://www.tingban.cn/webapi/broadcast/search?classifyid=1&pagenum=1&pagesize=24&_=1505142523339";
    public static final String NET_FM="http://www.tingban.cn/webapi/broadcast/search?classifyid=3&pagenum=1&pagesize=24&_=1505143134763";
    public static final String PROVINCE_FM="http://www.tingban.cn/webapi/broadcast/search?classifyid=2&area=%d&pagenum=1&pagesize=24&_=1505143623727";
}
