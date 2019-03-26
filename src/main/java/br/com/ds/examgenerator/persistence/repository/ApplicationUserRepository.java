package br.com.ds.examgenerator.persistence.repository;

import br.com.ds.examgenerator.persistence.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Douglas Souza on 25/03/2019
 */
public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
