package org.sang.dao;

import org.sang.entity.Memberships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipsDao extends JpaRepository<Memberships,Integer> {
}
