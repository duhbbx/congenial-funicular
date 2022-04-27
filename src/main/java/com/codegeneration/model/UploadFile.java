package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UploadFile implements Serializable {

    private static final long serialVersionUID = 8707708803818199247L;

    private Integer id;
    private Date createTime;
    private String relativePath;
    private String fileName;
    private Integer courseId;

}
