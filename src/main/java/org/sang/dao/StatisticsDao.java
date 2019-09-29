package org.sang.dao;

import org.sang.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsDao extends JpaRepository<Statistics,Integer> {
}
