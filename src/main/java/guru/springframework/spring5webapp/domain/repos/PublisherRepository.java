package guru.springframework.spring5webapp.domain.repos;
import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}