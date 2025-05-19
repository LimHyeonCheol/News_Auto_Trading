package com.lhc.trading.marketdata.service;

import com.lhc.trading.marketdata.entity.PriceCandle;
import com.lhc.trading.marketdata.repository.PriceCandleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceCandleRepository repository;

    public PriceServiceImpl(PriceCandleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void savePrice(PriceCandle candle) {
        repository.save(candle);
    }

    @Override
    public List<PriceCandle> getPrices(String ticker) {
        return repository.findByTicker(ticker);
    }
}
