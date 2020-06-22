package com.swat018.springdatademo;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface MyRepository<T, id extends Serializable> extends Repository<T, id> {
    <E extends T> E save(E entitiy);

    List<T> findAll();

    long count();
}
