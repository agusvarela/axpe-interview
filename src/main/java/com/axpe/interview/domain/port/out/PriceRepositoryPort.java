package com.axpe.interview.domain.port.out;


import com.axpe.interview.domain.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceRepositoryPort {

    Optional<Price> findPricesOrderByPriority(LocalDateTime applicationDate, Long productId, Long brandId);

}