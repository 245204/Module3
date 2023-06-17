package com.ust.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.model.FTTIssueBase;

@Repository
public interface FTTIssueBaseRepository extends JpaRepository <FTTIssueBase,String>{

}
