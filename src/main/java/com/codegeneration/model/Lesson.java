package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Lesson implements Serializable {

    private static final long serialVersionUID = -4485168740191721430L;

    private Integer id;
    private String lessonName;
    private Date createTime;
    private String status;
    private Date lastUpdateTime;
    private String videoRelativePath;
    private String question;
    private Integer courseId;
    private String videoName;

}
