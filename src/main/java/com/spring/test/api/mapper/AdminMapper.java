package com.spring.test.api.mapper;

import com.spring.test.api.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by hkw on 2017/5/26.
 */
//@Repository("adminMapper")
public interface AdminMapper {

    Admin queryAdmin(Admin admin);

}
