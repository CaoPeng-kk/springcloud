package com.caop.springcloud.mapper;

import com.caop.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 11:30 2020/11/5
 */
@Mapper
public interface DeptMapper {

    Dept selectDept(Integer number);
}
