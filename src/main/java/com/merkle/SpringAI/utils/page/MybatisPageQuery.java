package com.merkle.SpringAI.utils.page;

import lombok.Data;

import java.io.Serializable;

@Data
public class MybatisPageQuery implements Serializable {

    private Long pageIndex;

    private Long pageSize;

    public MybatisPageQuery() {

    }

    public MybatisPageQuery(Long pageIndex, Long pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

}
