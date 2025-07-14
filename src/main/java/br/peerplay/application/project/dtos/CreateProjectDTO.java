package br.peerplay.application.project.dtos;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateProjectDTO(
    @NotNull
    UUID ownerId,
    @NotNull
    @Size(max = 50)
    String title,
    MultipartFile projectThumbPicture
) 
implements Serializable {}
