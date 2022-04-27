package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Learning implements Serializable {

    private static final long serialVersionUID = -7216563864518466723L;

    private Integer id;
    private Date createTime;
    private Integer studentId;
    private Integer lessonId;
    private String answer;
    private String registerStatus;

}
