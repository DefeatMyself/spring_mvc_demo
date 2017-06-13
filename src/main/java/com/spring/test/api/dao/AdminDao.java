package com.spring.test.api.dao;

import com.spring.test.api.entity.Admin;
import com.spring.test.api.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by hkw on 2017/5/26.
 */
@Repository
public class AdminDao {

    @Autowired
//    @Qualifier("adminMapper")
    private AdminMapper adminMapper;

    public Admin queryAdmin(Admin admin) {
        return adminMapper.queryAdmin(admin);
    }

}
