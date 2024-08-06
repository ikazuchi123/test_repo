package com.merkle.SpringAI.utils.page;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;


public class MybatisPageUtils {

    public static <T extends MybatisPageQuery> Page ofPage(T params){
        Page page = new Page();
        Long pageIndex = params.getPageIndex();
        Long pageSize = params.getPageSize();

        if(pageIndex == null || pageIndex < 0){
            pageIndex = 1L;
        }
        if(pageSize == null || pageSize < 0){
            pageSize = 10L;
        }

        page.setCurrent(pageIndex);
        page.setSize(pageSize);
        return page;
    }

    public static <R> MybatisPageResult buildResult(Page page){
        if(page == null){
            return null;
        }
        MybatisPageResult pageResult = new MybatisPageResult();
        pageResult.setPageIndex(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        pageResult.setTotal(page.getTotal());
        pageResult.setRows(page.getRecords());
        return pageResult;
    }

    public static <R> MybatisPageResult buildResult(Page page, List<R> rows){
        if(page == null){
            return null;
        }
        MybatisPageResult pageResult = new MybatisPageResult();
        pageResult.setPageIndex(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        pageResult.setTotal(page.getTotal());
        pageResult.setRows(rows);
        return pageResult;
    }


}
