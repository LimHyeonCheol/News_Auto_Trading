package com.lhc.trading.marketdata.service;

import com.lhc.trading.marketdata.entity.PriceCandle;
import java.util.List;

public interface PriceService {
    void savePrice(PriceCandle candle);
    List<PriceCandle> getPrices(String ticker);
}
