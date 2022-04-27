package com.codegeneration.mapper;

import com.codegeneration.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByEmail(String email);

    void insert(User user);

    User findById(Integer studentId);

    Integer getRegisteredStudentNum();

    void update(User user);
}
