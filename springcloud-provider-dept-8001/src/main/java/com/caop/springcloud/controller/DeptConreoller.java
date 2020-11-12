package com.caop.springcloud.controller;

import com.caop.springcloud.pojo.Dept;
import com.caop.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 9:52 2020/11/9
 */
@RestController
public class DeptConreoller {

    @Autowired
    public DeptService deptService;

    @RequestMapping("/select")
    public Dept selectDept() {
        Dept dept = deptService.select();
        return dept;
    }


}
