package com.codegeneration.utils;

import lombok.Data;

import java.util.List;

/**
 * @author yx
 * @date 2022/4/22 23:05 星期五
 */
@Data
public class Pagination<T, V> {

    private List<T> data;

    private V query;

    private Integer pageIndex = 1;

    private Integer pageSize = 10;

    private Integer total = 0;

    public Integer getStart() {
        return (pageIndex - 1) * pageSize;
    }

    public Integer getLimit() {
        return pageSize;
    }

    public Integer getTotalPageNumber() {
        return (total - 1) / 10 + 1;
    }

}
