// Modelo de dados (DTO - Data Transfer Object) que representa a resposta json da API
// Transferência de dados
// JSON da API

package com.example.projectcurrencyconverterapi;

// Importa a classe Map da biblioteca Java, usada para
// armazenar pares de chave-valor

import java.util.HashMap;
import java.util.Map;


public class ExchangeRatesResponse {
    // Declara um mapa que armazena taxas de conversão em moedas.
    // A chave (String) representa o código da moeda (ex.: "USD", "EUR"),
    // e o valor (Double) representa a taxa de conversão para essa moeda.

    // Chave-valor -> "USD", 1;

    private Map<String, Double> conversion_rates = new HashMap<>();

    // Método público para acessar as taxas de conversão
    // Retorna o mapa contendo as taxas de conversão armazenadas.
    public Map<String, Double> getConversionRates(){
        return conversion_rates;
    }



}
