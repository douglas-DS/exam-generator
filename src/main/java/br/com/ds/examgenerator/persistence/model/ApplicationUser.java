package br.com.ds.examgenerator.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

/**
 * @author Douglas Souza on 25/03/2019
 */
@Entity
@Getter @Setter
public class ApplicationUser extends AbstractEntity {
    @NotEmpty(message = "The field cannot be empty")
    @Column(unique = true)
    private String username;

    @NotEmpty(message = "The field cannot be empty")
    private String password;

    @OneToOne
    private Professor professor;

    public ApplicationUser() {
    }

    public ApplicationUser(ApplicationUser applicationUser) {
        this.username = applicationUser.username;
        this.password = applicationUser.password;
        this.professor = applicationUser.professor;
    }
}
