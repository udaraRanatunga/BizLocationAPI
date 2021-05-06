/**
 * 
 */
package com.nibm.bizlocportal.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nibm.bizlocportal.model.ColomboZone;

/**
 * @author lily2
 *
 */
public interface ColomboZoneRepository extends JpaRepository<ColomboZone, Integer> {
	public Optional<ColomboZone> findByZonalNumber(String ZonalNumber);
	
	@Query(value = "SELECT * FROM COLOMBO_ZONE where id in (select colombo_zone_id from place_size where price_range_id = ?1)", nativeQuery = true)
	public Optional<List<ColomboZone>> findByBudget(int priceRangeId);
}
