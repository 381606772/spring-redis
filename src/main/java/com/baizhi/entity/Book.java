package com.baizhi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Book implements Serializable {
    private String bid;
    private String sn;
    private String name;
}
