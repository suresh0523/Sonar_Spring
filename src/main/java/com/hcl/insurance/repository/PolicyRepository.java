package com.hcl.insurance.repository;

/***
 * @author Anuradha
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.insurance.entity.Policy;


@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{

	Policy findByPolicyId(Integer policyId);

}
