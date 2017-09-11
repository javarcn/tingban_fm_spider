package com.javarcn.file;

import com.javarcn.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;

/**
 * Created by jiacheng on 2017/8/30 0030.
 */
public class FmTxt {
    private static final Logger log = LoggerFactory.getLogger(FmTxt.class);

    public static void save(Set<String> list) {
        try {
            PrintWriter writer = new PrintWriter(Constants.FM_PATH, "UTF-8");
            for(String fm:list){
                writer.write(fm.replaceAll(" ","")+"\r\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
