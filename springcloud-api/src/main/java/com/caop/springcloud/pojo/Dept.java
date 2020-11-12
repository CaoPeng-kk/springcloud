package com.caop.springcloud.pojo;

import java.io.Serializable;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 10:18 2020/11/5
 */
public class Dept implements Serializable {

    int deptId;
    String deptName;
    String dbSource;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
