package com.sik.pat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.sik.pat.domain.TestResult;

@Component
public interface TestResultRepository extends JpaRepository<TestResult, String>{

}
