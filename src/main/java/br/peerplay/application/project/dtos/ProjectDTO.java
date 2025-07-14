package br.peerplay.application.project.dtos;

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProjectDTO(
    @NotNull
    UUID id,
    @NotNull
    @Size(max = 50)
    String title,
    String thumbPictureUrl,
    @NotNull
    String ownerId
) implements Serializable {}
