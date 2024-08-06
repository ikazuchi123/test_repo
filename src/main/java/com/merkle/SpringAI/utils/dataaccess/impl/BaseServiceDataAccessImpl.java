package com.merkle.SpringAI.utils.dataaccess.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.merkle.SpringAI.entity.MybatisBaseEntity;
import com.merkle.SpringAI.utils.dataaccess.BaseServiceDataAccess;
import com.merkle.SpringAI.utils.page.MybatisPageQuery;
import com.merkle.SpringAI.utils.page.MybatisPageResult;
import com.merkle.SpringAI.utils.page.MybatisPageUtils;


/**
 * francis
 * 业务封装基础类
 */
public class BaseServiceDataAccessImpl <M extends BaseMapper<T>,T extends MybatisBaseEntity> extends ServiceImpl<M,T> implements BaseServiceDataAccess<T> {

    @Override
    public MybatisPageResult page(MybatisPageQuery query, T entity) {
        QueryWrapper queryWrapper= Wrappers.query(entity);

        return MybatisPageUtils.buildResult(page(new Page(query.getPageIndex(),query.getPageSize()),queryWrapper));
    }
}
