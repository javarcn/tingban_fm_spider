package com.javarcn.service;

import com.google.gson.Gson;
import com.javarcn.model.Category;
import com.javarcn.model.CategoryModel;
import com.javarcn.model.Fm;
import com.javarcn.model.FmModel;
import com.javarcn.util.Constants;
import com.javarcn.util.HttpUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiacheng
 * @created on 2017/9/11 20:39.
 */
public class FmService {
    private final static Logger log = LoggerFactory.getLogger(FmService.class);

    public static List<Category> getCategoryList() {
        String result = HttpUtil.get(Constants.CATEGORY_URL);
        CategoryModel model = new Gson().fromJson(result, CategoryModel.class);
        List<Category> categoryList = model.getResult().getDataList();
        Iterator<Category> iterator = categoryList.iterator();
        while (iterator.hasNext()) {
            Category c = iterator.next();
            if (c.getCategoryId() < 1) {
                iterator.remove();
            }
        }
        return categoryList;
    }

    public static List<Fm> getFmListByCategoryId(int categoryId) {
        String result = null;
        List<Fm> fmList = new ArrayList<Fm>();
        int page_num = getPageNumByCategoryId(categoryId);
        for (int page = 1; page <= page_num; page++) {
            result=HttpUtil.get(String.format(Constants.GET_FM_URL,categoryId,page));
            FmModel fmModel=null;
            if(StringUtils.isNotBlank(result)){
                fmModel = new Gson().fromJson(result, FmModel.class);
                List<Fm> list=fmModel.getResult().getDataList();
                if(list.size()>0){
                    fmList.addAll(list);
                }
            }
        }
        return fmList;
    }

    private static int getPageNumByCategoryId(int categoryId) {
        String url = Constants.GET_FM_URL;
        String result = HttpUtil.get(String.format(url, categoryId, 1));
        if (StringUtils.isNotBlank(result)) {
            FmModel fmModel = new Gson().fromJson(result, FmModel.class);
            return fmModel.getResult().getTotalPages();
        }else {
            log.error("categoryId="+categoryId+"获取该类目列表失败");
        }
        return 0;
    }

}
