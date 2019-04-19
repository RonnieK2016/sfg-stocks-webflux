package com.example.udemy.sfg.sfgstockswebflux.services;

import com.example.udemy.sfg.sfgstockswebflux.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}
