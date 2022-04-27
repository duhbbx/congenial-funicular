package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yx
 * @date 2022/2/15 21:30 星期二
 */
@Data
public class CourseCommentDetail implements Serializable {


    private static final long serialVersionUID = -5217271390299932982L;


    private Integer commentId;
    private Integer courseId;
    private Integer studentId;
    private String comment;
    private Date commentDate;
    private String reply;
    private Date replyDate;

    private String studentName;
}
