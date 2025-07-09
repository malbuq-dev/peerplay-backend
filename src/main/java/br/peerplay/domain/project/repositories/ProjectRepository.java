package br.peerplay.domain.project.repositories;

import java.util.UUID;

import br.peerplay.domain.core.CrudRepository;
import br.peerplay.domain.project.Project;

public interface ProjectRepository extends CrudRepository<Project, UUID>{

}
