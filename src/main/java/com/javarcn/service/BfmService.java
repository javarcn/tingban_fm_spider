package com.javarcn.service;

import com.google.gson.Gson;
import com.javarcn.file.FmTxt;
import com.javarcn.model.Bfm;
import com.javarcn.model.BfmModel;
import com.javarcn.util.Constants;
import com.javarcn.util.HttpUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jiacheng
 * @created on 2017/9/11 23:45.
 */
public class BfmService {
    private final static Logger log= LoggerFactory.getLogger(Bfm.class);

    public static void main(String[] args){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> start");
        long start_time=System.currentTimeMillis();
        List<Bfm> list=new ArrayList<Bfm>();
        List<Bfm> cfmlist=getCountryFm();
        List<Bfm> nfmlist=getNetFm();
        List<Bfm> pfmlist=getProviceFm();
        list.addAll(cfmlist);
        list.addAll(nfmlist);
        list.addAll(pfmlist);
        Set<String> stringList=new HashSet<String>();
        for(Bfm s:list){
            stringList.add(s.getName());
        }
        FmTxt.save(stringList);
        long end_time=System.currentTimeMillis();
        log.info("共爬取："+list.size()+",去重后剩余："+stringList.size()+"秒");
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 共耗费："+(end_time-start_time)/1000+"秒");
    }

    public static List<Bfm> getCountryFm() {
        List<Bfm> list = new ArrayList<Bfm>();
        String result = HttpUtil.get(Constants.COUNTRY_FM);
        if (StringUtils.isNotBlank(result)) {
            list.addAll(praseJson(result));
        }
        return list;
    }

    public static List<Bfm> getNetFm() {
        List<Bfm> list = new ArrayList<Bfm>();
        String result = HttpUtil.get(Constants.NET_FM);
        if (StringUtils.isNotBlank(result)) {
            list.addAll(praseJson(result));
        }
        return list;
    }

    public static List<Bfm> getProviceFm() {
        List<Bfm> list = new ArrayList<Bfm>();
        for (int i = 1; i <= 34; i++) {
            String result = HttpUtil.get(String.format(Constants.PROVINCE_FM, i));
            if(StringUtils.isNotBlank(result)){
                list.addAll(praseJson(result));
            }
        }
        return list;
    }

    public static List<Bfm> praseJson(String result) {
        List<Bfm> list = new ArrayList<Bfm>();
        if (StringUtils.isNotBlank(result)) {
            BfmModel model = new Gson().fromJson(result, BfmModel.class);
            List<Bfm> bfmList = model.getResult().getDataList();
            if (bfmList.size() > 0) {
                list.addAll(bfmList);
            }
        }
        return list;
    }
}
