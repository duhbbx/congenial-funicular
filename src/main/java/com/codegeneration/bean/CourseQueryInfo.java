package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CourseQueryInfo implements Serializable {

    private static final long serialVersionUID = -4583902278593305275L;

    private Integer courseId;

    private String courseName;

    private BigDecimal coursePrice;

    private Integer lessonNum;

    private String teacherName;

    private Integer teacherId;
}
