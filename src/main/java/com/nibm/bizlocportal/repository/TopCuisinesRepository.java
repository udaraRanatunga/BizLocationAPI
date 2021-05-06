/**
 * 
 */
package com.nibm.bizlocportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.bizlocportal.model.TopCuisines;

/**
 * @author lily2
 *
 */
public interface TopCuisinesRepository extends JpaRepository<TopCuisines, Integer> {

	Optional<List<TopCuisines>> findByColomboZoneId(Integer colomboZoneId);

}
