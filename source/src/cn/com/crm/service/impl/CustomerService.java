package cn.com.crm.service.impl;

import org.springframework.stereotype.Component;

import cn.com.crm.service.ServiceSimpleImpl;

/**
 * 客户管理的service
 * @author ping
 */
@Component(value="customerService")
public class CustomerService<T> extends ServiceSimpleImpl<T> {
}
