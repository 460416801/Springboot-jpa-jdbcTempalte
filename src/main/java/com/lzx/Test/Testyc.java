package com.lzx.Test;

import com.lzx.Config.APIResult;
import com.lzx.Config.BaseAPI;
import com.lzx.Config.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ronin on 2018/2/5.
 */

@RestController
public class Testyc extends BaseAPI{

    @GetMapping("/t")
    public APIResult test1(HttpServletRequest req){
        try {
            Map<String,Object> map = new HashMap<>();
            int i = 1 / 0;
            map.put("data",i);
            return this.setResult(ResultCode.SUCCESS,map);

        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getLocalizedMessage());
        }
    }

}
