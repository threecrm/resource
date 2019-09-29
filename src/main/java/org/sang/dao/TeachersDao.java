package org.sang.dao;

import org.sang.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachersDao extends JpaRepository<Teachers,Integer> {
}
