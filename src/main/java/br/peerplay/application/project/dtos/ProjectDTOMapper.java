package br.peerplay.application.project.dtos;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.peerplay.domain.project.Project;

@Mapper(
    unmappedTargetPolicy=ReportingPolicy.IGNORE,
    componentModel=MappingConstants.ComponentModel.SPRING
)
public interface ProjectDTOMapper {
    @Mapping(target="ownerId", source="owner.id")
    ProjectDTO toDto(Project dto);
}