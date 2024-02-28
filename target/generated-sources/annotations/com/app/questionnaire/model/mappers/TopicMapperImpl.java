package com.app.questionnaire.model.mappers;

import com.app.questionnaire.model.dto.TopicDTO;
import com.app.questionnaire.model.entity.Topic;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-28T23:09:10+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class TopicMapperImpl implements TopicMapper {

    @Override
    public TopicDTO toDTO(Topic topic) {
        if ( topic == null ) {
            return null;
        }

        TopicDTO.TopicDTOBuilder topicDTO = TopicDTO.builder();

        topicDTO.id( topic.getId() );
        topicDTO.name( topic.getName() );
        topicDTO.description( topic.getDescription() );

        return topicDTO.build();
    }

    @Override
    public List<TopicDTO> toDTOs(List<Topic> topics) {
        if ( topics == null ) {
            return null;
        }

        List<TopicDTO> list = new ArrayList<TopicDTO>( topics.size() );
        for ( Topic topic : topics ) {
            list.add( toDTO( topic ) );
        }

        return list;
    }

    @Override
    public Topic fromDTO(TopicDTO topicDTO) {
        if ( topicDTO == null ) {
            return null;
        }

        Topic.TopicBuilder topic = Topic.builder();

        topic.id( topicDTO.getId() );
        topic.name( topicDTO.getName() );
        topic.description( topicDTO.getDescription() );

        return topic.build();
    }
}
