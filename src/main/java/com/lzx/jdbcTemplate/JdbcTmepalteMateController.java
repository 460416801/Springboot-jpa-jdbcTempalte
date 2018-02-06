package com.lzx.jdbcTemplate;

import com.lzx.Config.APIResult;
import com.lzx.Config.BaseAPI;
import com.lzx.Config.ResultCode;
import com.lzx.jpa.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ronin on 2018/2/4.
 */
@RestController
@RequestMapping("/jdbc")
public class JdbcTmepalteMateController extends BaseAPI{

    @Autowired
    private JdbcTmepalteMateService mateService;

    @PostMapping("/add")
    public APIResult add(){
        try{
            Map<String,Object> map = new HashMap<String ,Object>();
            Mate m = new Mate();
            m.setName("hahaha");
            m.setAge(6);
            m.setBrithday(new Date());
            int add = mateService.add(m);
            map.put("data", add);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getMessage());
        }

    }

    @DeleteMapping("/del/{id}")
    public APIResult del(@PathVariable("id") Integer id){
        try{
            Map<String,Object> map = new HashMap<String ,Object>();
            map.put("data",mateService.del(id));
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getLocalizedMessage());
        }
    }

    @PutMapping("/update")
    public APIResult update(){
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            Mate m = new Mate();
            m.setName("hahaha");
            m.setAge(3);
            m.setBrithday(new Date());
            m.setId(11);
            map.put("data",mateService.update(m));
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getLocalizedMessage());
        }
    }

    @GetMapping("/findByName")
    public APIResult findByName(@RequestParam("name") String name){
        try{
            Map<String,Object> map = new HashMap<String ,Object>();
            map.put("data",mateService.findByName(name));
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getLocalizedMessage());
        }

    }

    @GetMapping("/findAll")
    public APIResult findAll(){
        try{
            Map<String,Object> map = new HashMap<String ,Object>();
            map.put("data",mateService.findAll());
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.ERROR,e.getLocalizedMessage());
        }
    }
}
