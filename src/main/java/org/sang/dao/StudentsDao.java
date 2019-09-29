package org.sang.dao;

import org.sang.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsDao extends JpaRepository<Students,Integer> {
}
