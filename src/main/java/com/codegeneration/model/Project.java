package com.codegeneration.model;

import lombok.Data;

import java.util.Date;

/**
 * @author yx
 * @date 2022/4/22 22:16 星期五
 */
@Data
public class Project {

    private Integer projectId;

    private String projectName;

    private Date createTime;

    private Date lastUpdateTime;

    private String packageName;

    private String description;

}
