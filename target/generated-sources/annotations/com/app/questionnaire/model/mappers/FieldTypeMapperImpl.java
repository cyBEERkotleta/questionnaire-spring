package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.FieldTypeDTO;
import com.app.questionnaire.model.entity.FieldType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-11T18:16:35+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class FieldTypeMapperImpl implements FieldTypeMapper {

    @Override
    public FieldTypeDTO toDTO(FieldType fieldType) {
        if ( fieldType == null ) {
            return null;
        }

        FieldTypeDTO.FieldTypeDTOBuilder fieldTypeDTO = FieldTypeDTO.builder();

        fieldTypeDTO.id( fieldType.getId() );
        fieldTypeDTO.name( fieldType.getName() );
        fieldTypeDTO.ableToHaveOptions( fieldType.getAbleToHaveOptions() );

        return fieldTypeDTO.build();
    }

    @Override
    public List<FieldTypeDTO> toDTOs(List<FieldType> fieldType) {
        if ( fieldType == null ) {
            return null;
        }

        List<FieldTypeDTO> list = new ArrayList<FieldTypeDTO>( fieldType.size() );
        for ( FieldType fieldType1 : fieldType ) {
            list.add( toDTO( fieldType1 ) );
        }

        return list;
    }

    @Override
    public FieldType fromDTO(FieldTypeDTO fieldTypeDTO) {
        if ( fieldTypeDTO == null ) {
            return null;
        }

        FieldType.FieldTypeBuilder fieldType = FieldType.builder();

        fieldType.id( fieldTypeDTO.getId() );
        fieldType.name( fieldTypeDTO.getName() );
        fieldType.ableToHaveOptions( fieldTypeDTO.getAbleToHaveOptions() );

        return fieldType.build();
    }
}
