package br.com.ds.examgenerator.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author Douglas Souza on 25/03/2019
 */
@Entity
@Getter @Setter
public class Professor extends AbstractEntity {
    @NotEmpty(message = "The field name cannot be empty")
    private String name;

    @Email
    @NotEmpty(message = "This email cannot be empty")
    @Column(unique = true)
    private String email;
}
