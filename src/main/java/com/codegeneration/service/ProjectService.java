package com.codegeneration.service;

import com.codegeneration.bean.ProjectPagingParam;
import com.codegeneration.mapper.ProjectMapper;
import com.codegeneration.model.Project;
import com.codegeneration.model.User;
import com.codegeneration.utils.Pagination;
import com.codegeneration.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author yx
 * @date 2022/4/22 23:13 星期五
 */
@Service
@Transactional
@Slf4j
public class ProjectService {

    @Autowired
    private ProjectMapper projectMapper;


    public Result<Project> insert(Project project) {
        Date date = new Date();
        project.setCreateTime(date);
        project.setLastUpdateTime(date);
        projectMapper.insert(project);
        return Result.success(project);
    }

    public Result<Pagination<Project, ProjectPagingParam>> paging(Pagination<Project, ProjectPagingParam> pagination) {
        List<Project> projectList = projectMapper.paging(pagination);
        Integer total = projectMapper.total(pagination);
        pagination.setData(projectList);
        pagination.setTotal(total);
        return Result.success(pagination);
    }
}
