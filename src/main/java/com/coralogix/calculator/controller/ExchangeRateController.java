package com.coralogix.calculator.controller;

import com.coralogix.calculator.domain.ExchangeRate;
import com.coralogix.calculator.enums.Currency;
import com.coralogix.calculator.services.ExchangeRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExchangeRateController {
    Logger logger = LoggerFactory.getLogger(ExchangeRateController.class);

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("getExchangeRate")
    public ResponseEntity getExchangeRate(@RequestParam Currency originCurrency, @RequestParam Currency finalCurrency) {
        try {

            ExchangeRate exchangerate = exchangeRateService.getExchangeRate(originCurrency, finalCurrency);
            //Service
            return new ResponseEntity(null, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping("getAllExchangeRate")
    public ResponseEntity<List<ExchangeRate>> getAllExchangeRate() {
        try {
            List<ExchangeRate> listExchangeRate =exchangeRateService.getAllExchangeRate();
            logger.info("listExchangeRate size:");
            logger.info(String.valueOf(listExchangeRate.size()));
            return new ResponseEntity<>(listExchangeRate, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @RequestMapping("getMatrizByValue")
    //4. Crear un endpoint de nombre getMatrizByValue que haga el siguiente ejercicio.
    //
    //
    //Dado un valor parámetro “userValue” que será enviado en el request se creará una matriz 10 x 10 donde en cada posición de la matriz i,j se coloque el valor:
    //  “(userValue * i) + valor de la matriz en la posición (i-1,j)”. El valor del parámetro “userValue” será ingresado desde consola (10 Min)
  /*  public ResponseEntity<List<Exchangerate>> getAllExchangeRate() {
        try {
            List<Exchangerate> listExchangeRate =exchangerateRepository.findAll();
            logger.info("listExchangeRate size:");
            logger.info(String.valueOf(listExchangeRate.size()));
            return new ResponseEntity<>(listExchangeRate, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
