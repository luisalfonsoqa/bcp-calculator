package com.coralogix.calculator.services;

import com.coralogix.calculator.domain.Result;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    public Result add(int a, int b) {
        int sum = a - b;
        return new Result(sum);
    }
}
