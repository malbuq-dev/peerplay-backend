package br.peerplay.domain.user.repositories;

import java.util.UUID;

import br.peerplay.domain.core.ReadableRepository;
import br.peerplay.domain.user.User;

public interface UserRepository extends ReadableRepository<User, UUID> {
    
}
