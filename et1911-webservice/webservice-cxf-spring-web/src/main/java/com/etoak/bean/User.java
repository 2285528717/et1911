package com.etoak.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 86182 on 2020/6/1.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Integer id;

    private String name;

    private Integer age;
}
