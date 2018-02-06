package com.lzx.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ronin on 2018/2/4.
 */
@Service
public class MateService {

    @Autowired
    private MateDAO mateDAO;


    public void save() {
        mateDAO.save(new Mate("张三", 12, new Date()));
        mateDAO.save(new Mate("李四", 21, new Date()));
        mateDAO.save(new Mate("王武", 24, new Date()));
        mateDAO.save(new Mate("何柳", 45, new Date()));
        mateDAO.save(new Mate("朝气", 65, new Date()));
        mateDAO.save(new Mate("刘行", 23, new Date()));
        mateDAO.save(new Mate("马腾", 22, new Date()));
        mateDAO.save(new Mate("韩察", 11, new Date()));
        mateDAO.save(new Mate("沙罗", 8, new Date()));
        mateDAO.save(new Mate("滨河", 91, new Date()));
    }

    public Mate findOne(Integer id) {

        return mateDAO.findOne(id);
    }

    public List<Mate> findAll() {
        return mateDAO.findAll();
    }

    public void delete(Integer id) {
        mateDAO.delete(id);
    }

    public void update(Mate mate) {
        mateDAO.save(mate);
    }

    public List<Mate> findByNameAndAge(String name, Integer age) {
        return mateDAO.findByNameAndAge(name, age);
    }

    public List<Mate> findBySql(String name, Integer age) {
        return mateDAO.findBySql(name, age);
    }
}
