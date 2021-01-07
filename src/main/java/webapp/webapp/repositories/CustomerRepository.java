package webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
