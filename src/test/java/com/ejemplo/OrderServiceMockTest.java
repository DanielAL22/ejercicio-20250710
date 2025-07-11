package com.devopsgang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class OrderServiceMockTest {

    @Test
    void testWithMockDisocunt() {
        //Arrange
        DiscountService buster = mock(DiscountService.class);
        when(buster.getRate("SALE10")).thenReturn(0.10);   //cuando llamen al codigo SALE10 vamos a retornar 0.10
        OrderService service = new OrderService(buster); 

        //Act
        double total = service.getTotal(100, "SALE10", true);

        //Assert
        assertEquals(110.0, total); // 100 - 10% + 20
    }
}