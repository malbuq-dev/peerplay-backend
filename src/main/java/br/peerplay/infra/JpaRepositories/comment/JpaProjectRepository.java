package br.peerplay.infra.JpaRepositories.comment;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.comment.Comment;
import br.peerplay.domain.comment.repositories.CommentRepository;

public interface JpaProjectRepository extends CommentRepository, JpaRepository<Comment, UUID> {
}
