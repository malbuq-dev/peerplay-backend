package br.peerplay.infra.JpaRepositories.reviewer_visitor;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.reviewer_visitor.ReviewerVisitor;
import br.peerplay.domain.reviewer_visitor.repositories.ReviewerVisitorRepository;

public interface JpaReviewerVisitor extends ReviewerVisitorRepository, JpaRepository<ReviewerVisitor, UUID> {
}