package br.peerplay.infra.JpaRepositories.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.peerplay.domain.user.User;
import br.peerplay.domain.user.repositories.UserRepository;

public interface JpaUserRepository extends UserRepository, JpaRepository<User, UUID>{
    
}
