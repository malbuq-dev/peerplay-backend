package br.peerplay.domain.user;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users", schema = "auth") 
public class User {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "role")
    private String role;

    @Column(name = "email", nullable = false)
    private String email;
}
