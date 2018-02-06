package com.lzx.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Ronin on 2018/2/3.
 */

/**
 *1.继承JpaRepository后可以不声明就使用简单的方法，例如：save、findOne、findAll、delete等
 *
 *2.我们也可以自定义简单的方法，例如  findByNameAndAge方法。这种应用少，因为逻辑简单。
 *
 *3.我们可以写sql来进行查找，例如 findBySql方法，这个其实是覆盖了原有的方法，但是上面可以写sql
 *
 */
public interface MateDAO extends JpaRepository<Mate,Integer> {

    List<Mate> findByNameAndAge(@Param("name") String name, @Param("age") Integer age);



    @Query(value = "select * from Mate m where m.name =:name and age=:age",nativeQuery = true)
    List<Mate> findBySql(@Param("name") String name, @Param("age") Integer age);

}
