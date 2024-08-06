package com.merkle.SpringAI.utils.dataaccess;

import com.baomidou.mybatisplus.extension.service.IService;
import com.merkle.SpringAI.utils.page.MybatisPageQuery;
import com.merkle.SpringAI.utils.page.MybatisPageResult;


/**
 * francis
 * 业务封装基础类
 */
public interface BaseServiceDataAccess<T> extends IService<T> {
    MybatisPageResult page(MybatisPageQuery query, T entity);
}
