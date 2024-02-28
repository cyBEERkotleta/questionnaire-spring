package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.AnswerDTO;
import com.app.questionnaire.model.dto.AnsweredFormDTO;
import com.app.questionnaire.model.dto.FieldDTO;
import com.app.questionnaire.model.dto.FieldOptionDTO;
import com.app.questionnaire.model.dto.FieldTypeDTO;
import com.app.questionnaire.model.dto.FormDTO;
import com.app.questionnaire.model.dto.GenderDTO;
import com.app.questionnaire.model.dto.TopicDTO;
import com.app.questionnaire.model.dto.UserDTO;
import com.app.questionnaire.model.dto.UserRoleDTO;
import com.app.questionnaire.model.entity.Answer;
import com.app.questionnaire.model.entity.AnsweredForm;
import com.app.questionnaire.model.entity.Field;
import com.app.questionnaire.model.entity.FieldOption;
import com.app.questionnaire.model.entity.FieldType;
import com.app.questionnaire.model.entity.Form;
import com.app.questionnaire.model.entity.Gender;
import com.app.questionnaire.model.entity.Topic;
import com.app.questionnaire.model.entity.User;
import com.app.questionnaire.model.entity.UserRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-28T23:09:10+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class AnsweredFormMapperImpl implements AnsweredFormMapper {

    @Override
    public AnsweredFormDTO toDTO(AnsweredForm answeredForm) {
        if ( answeredForm == null ) {
            return null;
        }

        AnsweredFormDTO.AnsweredFormDTOBuilder answeredFormDTO = AnsweredFormDTO.builder();

        answeredFormDTO.id( answeredForm.getId() );
        answeredFormDTO.answers( answerListToAnswerDTOList( answeredForm.getAnswers() ) );
        answeredFormDTO.form( formToFormDTO( answeredForm.getForm() ) );

        return answeredFormDTO.build();
    }

    @Override
    public List<AnsweredFormDTO> toDTOs(List<AnsweredForm> answeredForms) {
        if ( answeredForms == null ) {
            return null;
        }

        List<AnsweredFormDTO> list = new ArrayList<AnsweredFormDTO>( answeredForms.size() );
        for ( AnsweredForm answeredForm : answeredForms ) {
            list.add( toDTO( answeredForm ) );
        }

        return list;
    }

    @Override
    public AnsweredForm fromDTO(AnsweredFormDTO answeredFormDTO) {
        if ( answeredFormDTO == null ) {
            return null;
        }

        AnsweredForm.AnsweredFormBuilder answeredForm = AnsweredForm.builder();

        answeredForm.id( answeredFormDTO.getId() );
        answeredForm.form( formDTOToForm( answeredFormDTO.getForm() ) );
        answeredForm.answers( answerDTOListToAnswerList( answeredFormDTO.getAnswers() ) );

        return answeredForm.build();
    }

    protected FieldTypeDTO fieldTypeToFieldTypeDTO(FieldType fieldType) {
        if ( fieldType == null ) {
            return null;
        }

        FieldTypeDTO.FieldTypeDTOBuilder fieldTypeDTO = FieldTypeDTO.builder();

        fieldTypeDTO.id( fieldType.getId() );
        fieldTypeDTO.name( fieldType.getName() );
        fieldTypeDTO.ableToHaveOptions( fieldType.getAbleToHaveOptions() );

        return fieldTypeDTO.build();
    }

    protected FieldOptionDTO fieldOptionToFieldOptionDTO(FieldOption fieldOption) {
        if ( fieldOption == null ) {
            return null;
        }

        FieldOptionDTO.FieldOptionDTOBuilder fieldOptionDTO = FieldOptionDTO.builder();

        fieldOptionDTO.id( fieldOption.getId() );
        fieldOptionDTO.text( fieldOption.getText() );

        return fieldOptionDTO.build();
    }

    protected List<FieldOptionDTO> fieldOptionListToFieldOptionDTOList(List<FieldOption> list) {
        if ( list == null ) {
            return null;
        }

        List<FieldOptionDTO> list1 = new ArrayList<FieldOptionDTO>( list.size() );
        for ( FieldOption fieldOption : list ) {
            list1.add( fieldOptionToFieldOptionDTO( fieldOption ) );
        }

        return list1;
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

    protected FormDTO formToFormDTO(Form form) {
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

    protected FieldDTO fieldToFieldDTO(Field field) {
        if ( field == null ) {
            return null;
        }

        FieldDTO.FieldDTOBuilder fieldDTO = FieldDTO.builder();

        fieldDTO.id( field.getId() );
        fieldDTO.label( field.getLabel() );
        fieldDTO.type( fieldTypeToFieldTypeDTO( field.getType() ) );
        fieldDTO.required( field.getRequired() );
        fieldDTO.active( field.getActive() );
        fieldDTO.options( fieldOptionListToFieldOptionDTOList( field.getOptions() ) );
        fieldDTO.form( formToFormDTO( field.getForm() ) );

        return fieldDTO.build();
    }

    protected AnswerDTO answerToAnswerDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO.AnswerDTOBuilder answerDTO = AnswerDTO.builder();

        answerDTO.id( answer.getId() );
        answerDTO.text( answer.getText() );
        answerDTO.field( fieldToFieldDTO( answer.getField() ) );

        return answerDTO.build();
    }

    protected List<AnswerDTO> answerListToAnswerDTOList(List<Answer> list) {
        if ( list == null ) {
            return null;
        }

        List<AnswerDTO> list1 = new ArrayList<AnswerDTO>( list.size() );
        for ( Answer answer : list ) {
            list1.add( answerToAnswerDTO( answer ) );
        }

        return list1;
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

    protected Form formDTOToForm(FormDTO formDTO) {
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

    protected FieldType fieldTypeDTOToFieldType(FieldTypeDTO fieldTypeDTO) {
        if ( fieldTypeDTO == null ) {
            return null;
        }

        FieldType.FieldTypeBuilder fieldType = FieldType.builder();

        fieldType.id( fieldTypeDTO.getId() );
        fieldType.name( fieldTypeDTO.getName() );
        fieldType.ableToHaveOptions( fieldTypeDTO.getAbleToHaveOptions() );

        return fieldType.build();
    }

    protected FieldOption fieldOptionDTOToFieldOption(FieldOptionDTO fieldOptionDTO) {
        if ( fieldOptionDTO == null ) {
            return null;
        }

        FieldOption.FieldOptionBuilder fieldOption = FieldOption.builder();

        fieldOption.id( fieldOptionDTO.getId() );
        fieldOption.text( fieldOptionDTO.getText() );

        return fieldOption.build();
    }

    protected List<FieldOption> fieldOptionDTOListToFieldOptionList(List<FieldOptionDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<FieldOption> list1 = new ArrayList<FieldOption>( list.size() );
        for ( FieldOptionDTO fieldOptionDTO : list ) {
            list1.add( fieldOptionDTOToFieldOption( fieldOptionDTO ) );
        }

        return list1;
    }

    protected Field fieldDTOToField(FieldDTO fieldDTO) {
        if ( fieldDTO == null ) {
            return null;
        }

        Field.FieldBuilder field = Field.builder();

        field.id( fieldDTO.getId() );
        field.label( fieldDTO.getLabel() );
        field.type( fieldTypeDTOToFieldType( fieldDTO.getType() ) );
        field.required( fieldDTO.getRequired() );
        field.active( fieldDTO.getActive() );
        field.form( formDTOToForm( fieldDTO.getForm() ) );
        field.options( fieldOptionDTOListToFieldOptionList( fieldDTO.getOptions() ) );

        return field.build();
    }

    protected Answer answerDTOToAnswer(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer.AnswerBuilder answer = Answer.builder();

        answer.id( answerDTO.getId() );
        answer.text( answerDTO.getText() );
        answer.field( fieldDTOToField( answerDTO.getField() ) );

        return answer.build();
    }

    protected List<Answer> answerDTOListToAnswerList(List<AnswerDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Answer> list1 = new ArrayList<Answer>( list.size() );
        for ( AnswerDTO answerDTO : list ) {
            list1.add( answerDTOToAnswer( answerDTO ) );
        }

        return list1;
    }
}
