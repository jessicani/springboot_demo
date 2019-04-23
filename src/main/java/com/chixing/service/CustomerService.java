package com.chixing.service;

import com.chixing.entity.Customer;

public interface CustomerService {


    /**
     * 根据id查询用户信息
     * @param custId 用户id
     * @return 返回用户对象
     */
    public Customer getById(int custId);
}
