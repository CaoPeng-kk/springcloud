package com.caop.springcloud.service.impl;

import com.caop.springcloud.mapper.DeptMapper;
import com.caop.springcloud.pojo.Dept;
import com.caop.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 9:48 2020/11/9
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept select() {
        Dept dept = deptMapper.selectDept(1);
        return dept;
    }
}
