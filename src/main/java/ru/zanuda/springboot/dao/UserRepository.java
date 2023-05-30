package ru.zanuda.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zanuda.springboot.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
