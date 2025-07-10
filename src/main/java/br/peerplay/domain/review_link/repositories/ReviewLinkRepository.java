package br.peerplay.domain.review_link.repositories;

import java.util.UUID;

import br.peerplay.domain.core.CrudRepository;
import br.peerplay.domain.review_link.ReviewLink;

public interface ReviewLinkRepository extends CrudRepository<ReviewLink, UUID>{
    
}
