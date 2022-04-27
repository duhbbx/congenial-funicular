package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Course implements Serializable {

    private static final long serialVersionUID = 8095968261219405401L;

    private Integer id;
    private String name;
    private String catalogue;
    private String books;
    private BigDecimal price;
    private Date createTime;
    private Date lastUpdateTime;
    private Integer creatorId;
    private List<UploadFile> uploadFileList;
    private Integer lessonNum;

}
