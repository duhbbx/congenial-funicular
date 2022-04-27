package com.codegeneration.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yx
 * @date 2022/2/20 21:28 星期日
 */
@Data
public class LessonQuery implements Serializable {


    private static final long serialVersionUID = -1582668679686658272L;

    private Integer courseId;

    private String lessonName;

    private Integer studentId;

    private Integer teacherId;


}
