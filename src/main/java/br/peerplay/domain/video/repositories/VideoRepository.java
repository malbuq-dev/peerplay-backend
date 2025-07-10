package br.peerplay.domain.video.repositories;

import java.util.UUID;

import br.peerplay.domain.core.CrudRepository;
import br.peerplay.domain.video.Video;

public interface VideoRepository extends CrudRepository<Video, UUID> {
    
}
