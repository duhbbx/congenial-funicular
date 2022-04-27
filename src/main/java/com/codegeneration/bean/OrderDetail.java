package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderDetail implements Serializable {


    private static final long serialVersionUID = -8877425763465639035L;

    private Integer orderId;
    private Integer courseId;
    private String courseName;
    private Integer lessonNum;
    private String teacherName;
    private Integer teacherId;
    private String studentName;
    private String studentId;
    private BigDecimal payPrice;
    private String payTime;
    private String lastUpdateTime;
    private String orderStatus;
}
