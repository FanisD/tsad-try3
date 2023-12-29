package gr.hua.dit.ds.demo3.repository;

import gr.hua.dit.ds.demo3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}