/**
 * 
 */
package com.nibm.bizlocportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nibm.bizlocportal.model.NearbyRestaurant;

/**
 * @author lily2
 *
 */

public interface NearbyRestaurantRepository extends JpaRepository<NearbyRestaurant, Integer> {

	@Query(value = "SELECT * FROM NEARBY_RESTAURANT where colombo_zone_id = ?1", nativeQuery = true)
	Optional<List<NearbyRestaurant>> findByColomboZone(Integer colomboZoneId);
	

}
