package com.coralogix.calculator.repositories;

import com.coralogix.calculator.domain.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
}
