package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.GenderDTO;
import com.app.questionnaire.model.dto.UserDTO;
import com.app.questionnaire.model.dto.UserRoleDTO;
import com.app.questionnaire.model.entity.Gender;
import com.app.questionnaire.model.entity.User;
import com.app.questionnaire.model.entity.UserRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-11T18:16:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( user.getId() );
        userDTO.email( user.getEmail() );
        userDTO.firstName( user.getFirstName() );
        userDTO.lastName( user.getLastName() );
        userDTO.phoneNumber( user.getPhoneNumber() );
        userDTO.userRole( userRoleToUserRoleDTO( user.getUserRole() ) );
        userDTO.gender( genderToGenderDTO( user.getGender() ) );

        return userDTO.build();
    }

    @Override
    public List<UserDTO> toDTOs(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public User fromDTO(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userDTO.getId() );
        user.email( userDTO.getEmail() );
        user.firstName( userDTO.getFirstName() );
        user.lastName( userDTO.getLastName() );
        user.phoneNumber( userDTO.getPhoneNumber() );
        user.userRole( userRoleDTOToUserRole( userDTO.getUserRole() ) );
        user.gender( genderDTOToGender( userDTO.getGender() ) );

        return user.build();
    }

    protected UserRoleDTO userRoleToUserRoleDTO(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        UserRoleDTO.UserRoleDTOBuilder userRoleDTO = UserRoleDTO.builder();

        userRoleDTO.id( userRole.getId() );
        userRoleDTO.name( userRole.getName() );
        userRoleDTO.shownName( userRole.getShownName() );

        return userRoleDTO.build();
    }

    protected GenderDTO genderToGenderDTO(Gender gender) {
        if ( gender == null ) {
            return null;
        }

        GenderDTO.GenderDTOBuilder genderDTO = GenderDTO.builder();

        genderDTO.id( gender.getId() );
        genderDTO.name( gender.getName() );
        genderDTO.shownName( gender.getShownName() );

        return genderDTO.build();
    }

    protected UserRole userRoleDTOToUserRole(UserRoleDTO userRoleDTO) {
        if ( userRoleDTO == null ) {
            return null;
        }

        UserRole.UserRoleBuilder userRole = UserRole.builder();

        userRole.id( userRoleDTO.getId() );
        userRole.name( userRoleDTO.getName() );
        userRole.shownName( userRoleDTO.getShownName() );

        return userRole.build();
    }

    protected Gender genderDTOToGender(GenderDTO genderDTO) {
        if ( genderDTO == null ) {
            return null;
        }

        Gender.GenderBuilder gender = Gender.builder();

        gender.id( genderDTO.getId() );
        gender.name( genderDTO.getName() );
        gender.shownName( genderDTO.getShownName() );

        return gender.build();
    }
}
