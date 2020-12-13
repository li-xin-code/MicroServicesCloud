package com.lx.microServices.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 部门表
 * @author lx
 * @date 2020/12/13
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long deptNo;

    /**
     * 部门名称
     */
    private String dName;

    /**
     * 数据源名称
     */
    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
