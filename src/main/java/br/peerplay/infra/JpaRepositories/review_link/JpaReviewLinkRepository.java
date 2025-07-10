package br.peerplay.infra.JpaRepositories.review_link;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.review_link.repositories.ReviewLinkRepository;
import br.peerplay.domain.review_link.ReviewLink;

public interface JpaReviewLinkRepository extends ReviewLinkRepository, JpaRepository<ReviewLink, UUID> {
}