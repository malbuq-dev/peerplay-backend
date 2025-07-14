package br.peerplay.application.project.services;

import java.awt.print.Pageable;
import java.util.UUID;

import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Service;

import br.peerplay.application.project.dtos.CreateProjectDTO;
import br.peerplay.application.project.dtos.CreateProjectDTOMapper;
import br.peerplay.application.project.dtos.ProjectDTO;
import br.peerplay.application.project.dtos.ProjectDTOMapper;
import br.peerplay.application.project.dtos.ProjectTreeDTO;
import br.peerplay.application.project.dtos.UpdateProjectDTO;
import br.peerplay.domain.project.Project;
import br.peerplay.domain.project.repositories.ProjectRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final CreateProjectDTOMapper createProjectDTOMapper;
    private final ProjectDTOMapper projectDTOMapper;

    @Override
    public ProjectDTO create(CreateProjectDTO dto) {
        final Project project = createProjectDTOMapper.toEntity(dto);

        final Project created = projectRepository.save(project);

        return projectDTOMapper.toDto(created);
    }

    @Override
    public ProjectDTO update(UpdateProjectDTO dto, UUID projectId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public PagedModel<ProjectDTO> getUserProjects(UUID userId, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserProjects'");
    }

    @Override
    public ProjectTreeDTO getProjectFileTree(UUID projectId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectFileTree'");
    }

    @Override
    public void delete(UUID projectId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
