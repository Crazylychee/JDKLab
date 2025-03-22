package com.Crazylychee.demo03mysql.optimize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Page<T> {
    private int pageSize;
    private int pageNum;
    private int total;
    private int totalPage;
    private List<T> data;


}
