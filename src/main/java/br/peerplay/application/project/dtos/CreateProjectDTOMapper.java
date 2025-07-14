package br.peerplay.application.project.dtos;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import br.peerplay.domain.project.Project;
import br.peerplay.domain.user.User;
import br.peerplay.domain.user.repositories.UserRepository;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;

@Mapper(
    unmappedTargetPolicy=ReportingPolicy.IGNORE,
    componentModel=MappingConstants.ComponentModel.SPRING,
    uses = {CreateProjectDTOMapperHelpers.class}
)
public interface CreateProjectDTOMapper {
    @Mapping(target="owner", source="ownerId", qualifiedByName="ownerIdToUser")
    Project toEntity(CreateProjectDTO dto);
}

@Component
@AllArgsConstructor
class CreateProjectDTOMapperHelpers {

    private final UserRepository userRepository;

    @Named("ownerIdToUser")
    public @Nullable User ownerIdToUser(UUID ownerId) {
        return userRepository.findById(ownerId).orElseThrow(() ->
            new RuntimeException(
                "User with Id %s does not exist".formatted(ownerId)
            )
        );
    }
}