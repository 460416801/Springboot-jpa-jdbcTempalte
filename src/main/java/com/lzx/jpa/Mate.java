package com.lzx.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Ronin on 2018/2/3.
 */
@Entity
public class Mate {

    /** id 主键 */
    @Id
    @GeneratedValue
    private int id;
    

    /** 姓名 */
    private String name;
    

    /** 年龄 */
    private int age;
    
    /** 生日 */
    private Date brithday;

    public Mate() {
    }

    public Mate(String name, int age, Date brithday) {
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
