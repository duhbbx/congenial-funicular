package com.codegeneration.mapper;

import com.codegeneration.bean.ProjectPagingParam;
import com.codegeneration.model.Project;
import com.codegeneration.utils.Pagination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yx
 * @date 2022/4/22 23:03 星期五
 */
@Mapper
public interface ProjectMapper {

    int insert(Project project);

    int update(Project project);

    int page(Pagination<Project, ProjectPagingParam> projectPagination);

    int delete(Project project);

    int deleteByProjectId(Integer projectId);

    List<Project> paging(Pagination<Project, ProjectPagingParam> pagination);

    Integer total(Pagination<Project, ProjectPagingParam> pagination);
}
