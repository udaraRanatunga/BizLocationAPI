/**
 * 
 */
package com.nibm.bizlocportal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.bizlocportal.model.BusinessGoal;

/**
 * @author lily2
 *
 */
@Repository
public interface BusinessGoalRepository extends JpaRepository<BusinessGoal, Long> {

	

}
