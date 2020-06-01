package com.etoak.service;

import com.etoak.bean.User;

import javax.jws.WebService;

/**
 * Created by 86182 on 2020/6/1.
 */
@WebService
public interface UserService {

    User getById(int id);

}
