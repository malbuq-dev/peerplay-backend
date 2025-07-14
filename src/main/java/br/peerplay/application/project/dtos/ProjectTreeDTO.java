package br.peerplay.application.project.dtos;

import java.io.Serializable;
import java.util.UUID;

public record ProjectTreeDTO(
    UUID projectId,
    String title,
    String thumbPictureUrl
) implements Serializable {}
    
