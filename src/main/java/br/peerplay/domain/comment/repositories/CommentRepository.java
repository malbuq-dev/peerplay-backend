package br.peerplay.domain.comment.repositories;

import java.util.UUID;

import br.peerplay.domain.comment.Comment;
import br.peerplay.domain.core.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, UUID>{

}