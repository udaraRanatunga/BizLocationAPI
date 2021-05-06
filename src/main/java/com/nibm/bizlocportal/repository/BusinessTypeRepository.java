/**
 * 
 */
package com.nibm.bizlocportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.bizlocportal.model.BusinessType;
/**
 * @author lily2
 *
 */
@Repository
public interface BusinessTypeRepository extends JpaRepository<BusinessType, Integer> {

}
