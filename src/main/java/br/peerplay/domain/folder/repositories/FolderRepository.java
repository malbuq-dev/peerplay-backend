package br.peerplay.domain.folder.repositories;

import java.util.UUID;

import br.peerplay.domain.core.CrudRepository;
import br.peerplay.domain.folder.Folder;

public interface FolderRepository extends CrudRepository<Folder, UUID>{

}