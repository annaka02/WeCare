package com.infosys.wecaree.Repository;

import com.infosys.wecaree.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
