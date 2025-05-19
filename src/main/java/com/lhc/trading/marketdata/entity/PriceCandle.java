package com.lhc.trading.marketdata.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PriceCandle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;
    private LocalDateTime timestamp;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volume;

    // Getter/Setter 생략 or Lombok 사용 가능
}
