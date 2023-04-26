package com.burak.libraryapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="images")
@Getter
@NoArgsConstructor
@SuperBuilder
public class Image extends BaseModel{
    private String imageUrl;
}
