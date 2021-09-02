package com.github.darkgambite.converterapi.repositoty;

import com.github.darkgambite.converterapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
