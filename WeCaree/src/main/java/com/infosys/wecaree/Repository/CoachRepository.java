package com.infosys.wecaree.Repository;

import com.infosys.wecaree.Entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoachRepository extends JpaRepository<Coach , String> {


}
