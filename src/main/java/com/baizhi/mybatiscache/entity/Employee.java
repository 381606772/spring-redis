package com.baizhi.mybatiscache.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Employee implements Serializable {
    private String id;
    private String name;
}
