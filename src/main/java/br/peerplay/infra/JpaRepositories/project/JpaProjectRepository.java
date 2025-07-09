package br.peerplay.infra.JpaRepositories.project;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.project.Project;
import br.peerplay.domain.project.repositories.ProjectRepository;

public interface JpaProjectRepository extends ProjectRepository, JpaRepository<Project, UUID> {
}
