package com.workup.workup.dao;


import com.workup.workup.models.Profile;
import com.workup.workup.models.Project;
import com.workup.workup.models.ProjectImage;
import com.workup.workup.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
// PROJECT REPOSITORY
// PROJECT MODEL NOT CREATED OR CONNECTED YET! DELETE WHEN CONNECTED!!!! //
public interface ProjectsRepository extends JpaRepository<Project, Long> {
    Project getProjectByUserIs(User user);

    // need to add "find ALL by" projects in a list
    List<Project> getAllProjectsByUserIdIs(Long ownerUserId);
    List<ProjectImage> getProjectsById(Long projectId);
}
