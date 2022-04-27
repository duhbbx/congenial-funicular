package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CourseComment implements Serializable {
    private static final long serialVersionUID = 5408706058144164373L;

    private Integer id;
    private Integer courseId;
    private Integer studentId;
    private String comment;
    private Date commentDate;
    private String reply;
    private Date replyDate;
}
