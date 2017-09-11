package com.javarcn;

import com.javarcn.file.FmTxt;
import com.javarcn.model.Category;
import com.javarcn.model.Fm;
import com.javarcn.service.FmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    private final static Logger log= LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        log.info("考拉FM start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        long start_time = System.currentTimeMillis();
        List<Fm> fmList = new ArrayList<Fm>();
        List<Category> categoryList = FmService.getCategoryList();
        for (Category c : categoryList) {
            List<Fm> list = FmService.getFmListByCategoryId(c.getCategoryId());
            fmList.addAll(list);
        }
        log.info("共爬取有效类目："+categoryList.size()+"个;累计电台："+fmList.size());

        //TODO 去重，去掉
        Set<String> hashSet=new HashSet<String>();
        for(Fm  fm:fmList){
            hashSet.add(fm.getName().trim());
        }
        FmTxt.save(hashSet);
        log.info("去重后剩余FM："+hashSet.size());
        List<String> stringList=new ArrayList<String>();
        for(String s:hashSet){

            if(s.contains("（")){
                s=s.split("（")[0];
            }else if(s.contains("》")){
                s=s.split("》")[0];
            }else if(s.contains("")){

            }

            s.replaceAll("\\pP|\\pS", "");
        }
        long end_time = System.currentTimeMillis();
        log.info("考拉FM end >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>共耗时："+(end_time-start_time)/1000+"秒");
    }
}
