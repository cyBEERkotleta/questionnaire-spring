package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.UserRoleDTO;
import com.app.questionnaire.model.entity.UserRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-11T18:16:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRoleDTO toDTO(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        UserRoleDTO.UserRoleDTOBuilder userRoleDTO = UserRoleDTO.builder();

        userRoleDTO.id( userRole.getId() );
        userRoleDTO.name( userRole.getName() );
        userRoleDTO.shownName( userRole.getShownName() );

        return userRoleDTO.build();
    }

    @Override
    public List<UserRoleDTO> toDTOs(List<UserRole> userRoles) {
        if ( userRoles == null ) {
            return null;
        }

        List<UserRoleDTO> list = new ArrayList<UserRoleDTO>( userRoles.size() );
        for ( UserRole userRole : userRoles ) {
            list.add( toDTO( userRole ) );
        }

        return list;
    }

    @Override
    public UserRole fromDTO(UserRoleDTO userRoleDTO) {
        if ( userRoleDTO == null ) {
            return null;
        }

        UserRole.UserRoleBuilder userRole = UserRole.builder();

        userRole.id( userRoleDTO.getId() );
        userRole.name( userRoleDTO.getName() );
        userRole.shownName( userRoleDTO.getShownName() );

        return userRole.build();
    }
}
