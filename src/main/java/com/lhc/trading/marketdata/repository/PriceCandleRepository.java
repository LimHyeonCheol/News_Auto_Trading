package com.lhc.trading.marketdata.repository;

import com.lhc.trading.marketdata.entity.PriceCandle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceCandleRepository extends JpaRepository<PriceCandle, Long> {
    List<PriceCandle> findByTicker(String ticker);
}
