package br.peerplay.application.project.dtos;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public record UpdateProjectDTO(
    String title,
    MultipartFile projectThumbPicture
) implements Serializable {}
