package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderQuery implements Serializable {

    private static final long serialVersionUID = 2519520721328855902L;

    private String courseName;

    private String teacherName;

    private String studentName;

    private String orderStatus;
}
