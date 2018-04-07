package com.maolin.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Symbol {
    @Override
    public String toString() {
        return "Symbol{" +
                "Symbol='" + Symbol + '\'' +
                ", Name='" + Name + '\'' +
                ", Exchange='" + Exchange + '\'' +
                '}';
    }
    @Id
    private  Integer id;
    @JsonProperty(value = "Symbol")
    private String Symbol;
    @JsonProperty(value = "Name")
    private String Name;
    @JsonProperty(value = "Exchange")
    private String Exchange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getExchange() {
        return Exchange;
    }

    public void setExchange(String exchange) {
        Exchange = exchange;
    }
}
