package com.codegeneration.controller;

import com.codegeneration.bean.ProjectPagingParam;
import com.codegeneration.model.Project;
import com.codegeneration.service.ProjectService;
import com.codegeneration.utils.Pagination;
import com.codegeneration.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author yx
 * @date 2022/4/22 23:12 星期五
 */

@RestController
@RequestMapping("/project")
@Slf4j
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @PostMapping("/insert")
    Result<Project> insert(@RequestBody Project project) {
        return projectService.insert(project);
    }

    @PostMapping("/paging")
    Result<Pagination<Project, ProjectPagingParam>> paging(@RequestBody Pagination<Project, ProjectPagingParam> pagination) {
        return projectService.paging(pagination);
    }

}
