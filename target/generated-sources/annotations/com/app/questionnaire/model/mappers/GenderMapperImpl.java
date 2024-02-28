package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.GenderDTO;
import com.app.questionnaire.model.entity.Gender;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-11T18:16:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class GenderMapperImpl implements GenderMapper {

    @Override
    public GenderDTO toDTO(Gender gender) {
        if ( gender == null ) {
            return null;
        }

        GenderDTO.GenderDTOBuilder genderDTO = GenderDTO.builder();

        genderDTO.id( gender.getId() );
        genderDTO.name( gender.getName() );
        genderDTO.shownName( gender.getShownName() );

        return genderDTO.build();
    }

    @Override
    public List<GenderDTO> toDTOs(List<Gender> genders) {
        if ( genders == null ) {
            return null;
        }

        List<GenderDTO> list = new ArrayList<GenderDTO>( genders.size() );
        for ( Gender gender : genders ) {
            list.add( toDTO( gender ) );
        }

        return list;
    }

    @Override
    public Gender fromDTO(GenderDTO genderDTO) {
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
