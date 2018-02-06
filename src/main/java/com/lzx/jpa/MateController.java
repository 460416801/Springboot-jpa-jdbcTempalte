package com.lzx.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Ronin on 2018/2/4.
 * 本包主要讲的是对jpa的使用
 * 注意在使用jpa的时候需要添加jpa的依赖
 * 在使用jpa的时候需要在dao层继承JpaRepository
 *
 */
@RestController
@RequestMapping("/jpa")
public class MateController {

    @Autowired
    private MateService mateService;


    @PostMapping("/save")
    public void save() {
        mateService.save();
    }

    @GetMapping("/findOne/{id}")
    public Mate findOne(@PathVariable("id") Integer id) {
        return mateService.findOne(id);
    }

    @GetMapping("/findAll")
    public List<Mate> findAll() {
        return mateService.findAll();
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable("id")Integer id) {
        mateService.delete(1);
    }

    @PutMapping("/upd")
    public void update() {
        Mate mate = new Mate();
        mate.setId(1);
        mate.setAge(101);
        mate.setName("妖怪");
        mate.setBrithday(new Date());
        mateService.update(mate);
    }

    @GetMapping("/findByNameAndAge")
    public List<Mate> findByNameAndAge(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return mateService.findByNameAndAge(name, age);
    }

    @GetMapping("/findBySql")
    public List<Mate> findBySql(@RequestParam("name")String name,@RequestParam("age") Integer age) {
        return mateService.findBySql(name,age);
    }
}
