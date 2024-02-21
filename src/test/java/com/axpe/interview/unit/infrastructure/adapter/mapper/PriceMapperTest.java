package com.axpe.interview.unit.infrastructure.adapter.mapper;

import com.axpe.interview.domain.model.Price;
import com.axpe.interview.infrastructure.adapter.dto.PriceResponseDto;
import com.axpe.interview.infrastructure.adapter.mapper.PriceMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PriceMapperTest {

    @Test
    public void mapToPriceResponseDto_whenPriceIsValid_thenReturnsPriceResponseDto() {
        Price price = new Price();
        price.setProductId(1L);
        price.setBrandId(2L);

        PriceMapper priceMapper = new PriceMapper();

        PriceResponseDto responseDto = priceMapper.mapToPriceResponseDto(price);

        assertEquals(price.getProductId(), responseDto.getProductId());
        assertEquals(price.getBrandId(), responseDto.getBrandId());
    }

    @Test
    public void mapToPriceResponseDto_whenPriceIsNull_thenThrowsIllegalArgumentException() {
        PriceMapper priceMapper = new PriceMapper();

        assertThrows(IllegalArgumentException.class, () -> priceMapper.mapToPriceResponseDto(null));
    }
}
