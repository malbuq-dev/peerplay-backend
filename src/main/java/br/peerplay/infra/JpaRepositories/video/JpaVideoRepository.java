package br.peerplay.infra.JpaRepositories.video;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.video.Video;
import br.peerplay.domain.video.repositories.VideoRepository;

public interface JpaVideoRepository extends VideoRepository, JpaRepository<Video, UUID> {
}
