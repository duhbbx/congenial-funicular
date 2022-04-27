package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -4829273183444417809L;

    private Integer id;
    private Integer studentId;
    private Integer courseId;
    /**
     * 购买日期,成交时间
     */
    private Date payTime;
    /**
     * 成交价格
     */
    private BigDecimal payPrice;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 最后一次的修改时间
     */
    private Date lastUpdateTime;

}
