package com.codegeneration.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class LessonDetail implements Serializable {

    private Integer lessonId;
    private String lessonName;
    private String videoRelativePath;
    private Integer registeredNum;
    private Integer submittedAnswerNum;
    private String status;
    private Integer courseId;
    private String courseName;
    private String question;
    private Date createTime;
    private Date lastUpdateTime;
    private String videoName;


}
