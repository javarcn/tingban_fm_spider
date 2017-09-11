package com.javarcn.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class HttpUtil {
    private static final Logger log = LoggerFactory.getLogger(HttpUtil.class);

    public static String get(String url) {
        String result = null;
        int error_num = 0;
        int retryTimes = 1;
        do {
            HttpGet get = new HttpGet(url);
            CloseableHttpClient client = HttpClients.createDefault();
            get.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
            get.addHeader("Accept-Encoding", "gzip, deflate, sdch");
            get.addHeader("Accept-Language", "zh-CN,zh;q=0.8");
            get.addHeader("Connection", "keep-alive");
            get.addHeader("Cookie", "kl_web_tmp_udid=15051330820418721674; __qc_wId=776; pgv_pvid=8070094597; JSESSIONID=15c9tilfl2nygvr9ulufx5tg2; Hm_lvt_0ae70107bbda90ac05dec7ae304220b9=1505133083; Hm_lpvt_0ae70107bbda90ac05dec7ae304220b9=1505136025");
            get.addHeader("Host", "www.tingban.cn");
            get.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
            get.addHeader("X-Requested-With", "XMLHttpRequest");
            try {
                HttpResponse response = client.execute(get);
                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        result = EntityUtils.toString(entity, "UTF-8");
                    }
                }
            } catch (IOException e) {
                try {
                    log.error("第{}次请求异常，系统睡眠1秒后重试,URL:============{}", ++error_num, url);
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        } while (++retryTimes <= 3);
        return result;
//        throw new RuntimeException("服务端异常，超出重试次数!");
    }
}
