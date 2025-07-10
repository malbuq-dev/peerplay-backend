package br.peerplay.domain.reviewer_visitor.repositories;

import java.util.UUID;

import br.peerplay.domain.core.CrudRepository;
import br.peerplay.domain.reviewer_visitor.ReviewerVisitor;

public interface ReviewerVisitorRepository extends CrudRepository<ReviewerVisitor, UUID>{
    
}