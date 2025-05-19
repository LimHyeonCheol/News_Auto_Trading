package com.lhc.trading.marketdata.controller;

import com.lhc.trading.marketdata.entity.PriceCandle;
import com.lhc.trading.marketdata.service.PriceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marketdata")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @PostMapping
    public void savePrice(@RequestBody PriceCandle candle) {
        priceService.savePrice(candle);
    }

    @GetMapping("/{ticker}")
    public List<PriceCandle> getPrices(@PathVariable String ticker) {
        return priceService.getPrices(ticker);
    }
}
