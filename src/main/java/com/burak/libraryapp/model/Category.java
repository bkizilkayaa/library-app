package com.burak.libraryapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name="category")
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseModel {
    private String name;
    @OneToMany
    @JsonIgnore
    private List<Book> bookList;
}
