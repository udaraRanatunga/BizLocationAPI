/**
 * 
 */
package com.nibm.bizlocportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.bizlocportal.model.PlaceSize;

/**
 * @author lily2
 *
 */
public interface PlaceSizeRepository extends JpaRepository<PlaceSize, Integer> {

	Optional<PlaceSize> findByColomboZone(int colomboZoneId);

}
