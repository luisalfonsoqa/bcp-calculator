package com.coralogix.calculator.services;

import com.coralogix.calculator.domain.ExchangeRate;
import com.coralogix.calculator.enums.Currency;
import com.coralogix.calculator.repositories.ExchangeRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ExchangeRateService {
    Logger logger = LoggerFactory.getLogger(ExchangeRateService.class);
    @Autowired
    private ExchangeRateRepository exchangerateRepository;

    public ExchangeRate getExchangeRate(Currency originCurrency, Currency finalCurrency) {
        String date = "";
        String value = "";

        ExchangeRate exchangerate = new ExchangeRate();
        exchangerate.setOrigincurrency(originCurrency.name());
        exchangerate.setFinalcurrency(finalCurrency.name());
        exchangerate.setDate(date);
        exchangerate.setValue1(value);

        logger.info(exchangerate.getOrigincurrency());
        exchangerate = exchangerateRepository.save(exchangerate);
        return exchangerate;

    }


    public
    List<ExchangeRate> getAllExchangeRate() {
        return exchangerateRepository.findAll();
    }
}
