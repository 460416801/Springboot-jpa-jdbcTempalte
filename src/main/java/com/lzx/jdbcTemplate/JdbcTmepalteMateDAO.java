package com.lzx.jdbcTemplate;

import com.lzx.jpa.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ronin on 2018/2/4.
 */
//为了使用jdbcTempalte在dao层必须使用@Repository注解进行持久化操作
@Repository
public class JdbcTmepalteMateDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Mate mate){
        String sql = "insert into mate(name,age,brithday) values(?,?,?)";
        return jdbcTemplate.update(sql,mate.getName(),mate.getAge(),mate.getBrithday());
    }

    public int del(Integer id){
        String sql = "delete from mate where id =?";
        return jdbcTemplate.update(sql,id);
    }

    public int update(Mate mate){
        String sql = "update mate set name=?,age=?,brithday=? where id=?";
        return jdbcTemplate.update(sql,mate.getName(),mate.getAge(),mate.getBrithday(),mate.getId());
    }

    public List<Mate> findByName(String name){
        RowMapper<Mate> rowMapper = new BeanPropertyRowMapper<>(Mate.class);
        String sql = "select * from mate where name = ?";
        return jdbcTemplate.query(sql,new Object[] {name},rowMapper);//rowMapper 是为了返回查询结果集
    }

    public List<Mate> findAll(){
        RowMapper<Mate> rowMapper = new BeanPropertyRowMapper<>(Mate.class);
        String sql = "select * from mate";
        return jdbcTemplate.query(sql,new Object[] {},rowMapper);//rowMapper 是为了返回查询结果集
    }
}
