package com.codegeneration.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -6232504513066505054L;

    private Integer id;

    private String username;

    private String email;

    private String password;

    private Date createTime;

    private String type;

    private String originalPassword;
}
