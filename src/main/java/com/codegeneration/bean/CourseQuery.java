package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseQuery implements Serializable {


    private static final long serialVersionUID = 4251952568205361636L;

    private String courseName;

    private String teacherName;

    private Integer teacherId;
}
