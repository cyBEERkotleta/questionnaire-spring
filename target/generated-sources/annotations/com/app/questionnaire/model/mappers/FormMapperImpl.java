package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.FormDTO;
import com.app.questionnaire.model.dto.GenderDTO;
import com.app.questionnaire.model.dto.TopicDTO;
import com.app.questionnaire.model.dto.UserDTO;
import com.app.questionnaire.model.dto.UserRoleDTO;
import com.app.questionnaire.model.entity.Form;
import com.app.questionnaire.model.entity.Gender;
import com.app.questionnaire.model.entity.Topic;
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
public class FormMapperImpl implements FormMapper {

    @Override
    public FormDTO toDTO(Form form) {
        if ( form == null ) {
            return null;
        }

        FormDTO.FormDTOBuilder formDTO = FormDTO.builder();

        formDTO.id( form.getId() );
        formDTO.name( form.getName() );
        formDTO.shown( form.getShown() );
        formDTO.topic( topicToTopicDTO( form.getTopic() ) );
        formDTO.user( userToUserDTO( form.getUser() ) );

        return formDTO.build();
    }

    @Override
    public List<FormDTO> toDTOs(List<Form> forms) {
        if ( forms == null ) {
            return null;
        }

        List<FormDTO> list = new ArrayList<FormDTO>( forms.size() );
        for ( Form form : forms ) {
            list.add( toDTO( form ) );
        }

        return list;
    }

    @Override
    public Form fromDTO(FormDTO formDTO) {
        if ( formDTO == null ) {
            return null;
        }

        Form.FormBuilder form = Form.builder();

        form.id( formDTO.getId() );
        form.name( formDTO.getName() );
        form.shown( formDTO.getShown() );
        form.topic( topicDTOToTopic( formDTO.getTopic() ) );
        form.user( userDTOToUser( formDTO.getUser() ) );

        return form.build();
    }

    protected TopicDTO topicToTopicDTO(Topic topic) {
        if ( topic == null ) {
            return null;
        }

        TopicDTO.TopicDTOBuilder topicDTO = TopicDTO.builder();

        topicDTO.id( topic.getId() );
        topicDTO.name( topic.getName() );
        topicDTO.description( topic.getDescription() );

        return topicDTO.build();
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

    protected UserDTO userToUserDTO(User user) {
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

    protected Topic topicDTOToTopic(TopicDTO topicDTO) {
        if ( topicDTO == null ) {
            return null;
        }

        Topic.TopicBuilder topic = Topic.builder();

        topic.id( topicDTO.getId() );
        topic.name( topicDTO.getName() );
        topic.description( topicDTO.getDescription() );

        return topic.build();
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

    protected User userDTOToUser(UserDTO userDTO) {
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
}
