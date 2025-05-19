package com.lhc.trading.marketdata.scheduler;

import com.lhc.trading.marketdata.entity.PriceCandle;
import com.lhc.trading.marketdata.service.PriceService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MarketDataScheduler {

    private final PriceService priceService;

    public MarketDataScheduler(PriceService priceService) {
        this.priceService = priceService;
    }

    @Scheduled(fixedRate = 60000) // 1분마다 실행
    public void fetchMarketData() {
        PriceCandle candle = new PriceCandle();
        candle.setTicker("AAPL");
        candle.setTimestamp(LocalDateTime.now());
        candle.setOpen(170.0);
        candle.setHigh(175.0);
        candle.setLow(168.5);
        candle.setClose(172.3);
        candle.setVolume(150000L);

        priceService.savePrice(candle);
    }
}
