package com.codegeneration.bean;

import com.codegeneration.model.Course;
import com.codegeneration.model.Learning;
import com.codegeneration.model.Lesson;
import com.codegeneration.model.User;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yx
 * @date 2022/2/25 19:57 星期五
 */
@Data
public class LearningDetail implements Serializable {
    private static final long serialVersionUID = 2894984549984905839L;

    private Course course;
    private User teacher;
    private Lesson lesson;
    private Learning learning;

}
