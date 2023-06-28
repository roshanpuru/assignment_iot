package assignment.customer.rewards.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment.customer.rewards.object.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
     List<Customer> findByName(String userName);
}
