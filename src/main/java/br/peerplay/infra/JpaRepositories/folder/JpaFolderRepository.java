package br.peerplay.infra.JpaRepositories.folder;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.folder.Folder;
import br.peerplay.domain.folder.repositories.FolderRepository;

public interface JpaFolderRepository extends FolderRepository, JpaRepository<Folder, UUID> {
}
