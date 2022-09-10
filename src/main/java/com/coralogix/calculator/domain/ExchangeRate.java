package com.coralogix.calculator.domain;

import com.coralogix.calculator.enums.Currency;

import javax.persistence.*;

@Entity
@Table(name = "EXCHANGERATE")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ORIGINCURRENCY")
    private String origincurrency;

    @Column(name = "FINALCURRENCY")
    private String finalcurrency;

    @Column(name = "DATE")
    private String date;

    @Column(name = "value1")
    private String value1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigincurrency() {
        return origincurrency;
    }

    public void setOrigincurrency(String origincurrency) {
        this.origincurrency = origincurrency;
    }

    public String getFinalcurrency() {
        return finalcurrency;
    }

    public void setFinalcurrency(String finalcurrency) {
        this.finalcurrency = finalcurrency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

}