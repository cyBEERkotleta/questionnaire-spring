package com.app.questionnaire.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.ArrayList;
import java.util.List;

/**
 * сущность - пол пользователя сайта
 *
 * @author Катя Левкович
 * @version 1.3, 01.07.2023
 */
@Data
@ToString(exclude = "users")
@EqualsAndHashCode(exclude = {"users"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "gender_types")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Short id;

    @Column(name = "name")
    private String name;

    @Column(name = "shown_name")
    private String shownName;

    @Fetch(FetchMode.SELECT)
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "gender")
    private List<User> users = new ArrayList<>();

    public static Gender female() {
        return Gender.builder()
                .id((short) 1)
                .name("FEMALE")
                .shownName("Женский")
                .build();
    }

    public static Gender male() {
        return Gender.builder()
                .id((short) 2)
                .name("MALE")
                .shownName("Мужской")
                .build();
    }
}
