package com.project.workspace.domain.repository;

import com.project.workspace.domain.vo.ProjectPersonVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectPersonRepository extends JpaRepository<ProjectPersonVO,Long> {
}
