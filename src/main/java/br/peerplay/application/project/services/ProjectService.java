package br.peerplay.application.project.services;

import java.awt.print.Pageable;
import java.util.UUID;

import org.springframework.data.web.PagedModel;

import br.peerplay.application.project.dtos.CreateProjectDTO;
import br.peerplay.application.project.dtos.ProjectDTO;
import br.peerplay.application.project.dtos.ProjectTreeDTO;
import br.peerplay.application.project.dtos.UpdateProjectDTO;

public interface ProjectService {
    ProjectDTO create(CreateProjectDTO dto);

    ProjectDTO update(UpdateProjectDTO dto, UUID projectId);

    PagedModel<ProjectDTO> getUserProjects(UUID userId, Pageable pageable);

    ProjectTreeDTO getProjectFileTree(UUID projectId);

    void delete(UUID projectId);
}
