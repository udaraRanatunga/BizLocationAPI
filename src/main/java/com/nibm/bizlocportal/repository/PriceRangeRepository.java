/**
 * 
 */
package com.nibm.bizlocportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.bizlocportal.model.PriceRange;

/**
 * @author lily2
 *
 */
public interface PriceRangeRepository extends JpaRepository<PriceRange, Integer> {

}
