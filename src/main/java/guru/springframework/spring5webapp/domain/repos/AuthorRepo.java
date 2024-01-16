package guru.springframework.spring5webapp.domain.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{
    
}
    

