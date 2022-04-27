package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author yx
 * @date 2022/2/18 22:39 星期五
 */
@Data
public class OrderOverview implements Serializable {


    private static final long serialVersionUID = -8595752351143046619L;

    private Integer registeredStudent;

    private Integer commentNum;

    private BigDecimal totalOrderIncome;

    private Integer totalOrderNum;

}
