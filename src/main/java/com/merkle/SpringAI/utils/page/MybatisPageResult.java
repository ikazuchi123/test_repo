package com.merkle.SpringAI.utils.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MybatisPageResult<T> implements Serializable {

    private List<T> rows;

    private Long total;

    private Long pageIndex;

    private Long pageSize;


}
