package com.codegeneration.bean;

import com.codegeneration.model.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CourseDetail implements Serializable {

    private static final long serialVersionUID = -8437134626585940949L;

    private Course course;

    private User teacher;

    private List<CourseCommentDetail> courseCommentDetailList;

    private List<UploadFile> uploadFileList;

    private Order order;
}
