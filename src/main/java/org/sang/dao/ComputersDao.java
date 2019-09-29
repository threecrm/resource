package org.sang.dao;

import org.sang.entity.Computers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputersDao extends JpaRepository<Computers,Integer> {
}
