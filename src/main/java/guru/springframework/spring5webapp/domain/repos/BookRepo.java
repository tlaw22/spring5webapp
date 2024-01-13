package guru.springframework.spring5webapp.domain.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

    
} 
