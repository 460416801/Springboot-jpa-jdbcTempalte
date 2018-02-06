package com.lzx.jdbcTemplate;


import com.lzx.jpa.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ronin on 2018/2/4.
 */
@Service
public class JdbcTmepalteMateService {

    @Autowired
    private JdbcTmepalteMateDAO jdbcTmepalteMateDAO;

    public int add(Mate mate){
        return jdbcTmepalteMateDAO.add(mate);
    }

    public int del(Integer id){
        return jdbcTmepalteMateDAO.del(id);
    }

    public int update(Mate mate){
        return jdbcTmepalteMateDAO.update(mate);
    }

    public List<Mate> findByName(String name){
        return jdbcTmepalteMateDAO.findByName(name);
    }

    public List<Mate> findAll(){
        return jdbcTmepalteMateDAO.findAll();
    }
}