// package com.devopsgang;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertThrows;

// public class OrderServiceTest {
//     private final OrderService orderService = new OrderService();

//     @Test
//     public void testTotalWithoutDiscountAndStandardShipping() {
//         double subtotal = 100.0;
//         boolean hasDiscount = false;
//         boolean hasExpressShipping = false;

//         double expected = 100.0 + 10.0; // no discount + standard shipping
//         double actual = orderService.getTotal(subtotal, hasDiscount, hasExpressShipping);

//         assertEquals(expected, actual, 0.0001);
//     }

//     @Test
//     public void testTotalWithDiscountAndStandardShipping() {
//         double subtotal = 100.0;
//         boolean hasDiscount = true;
//         boolean hasExpressShipping = false;

//         double expected = (100.0 * 0.9) + 10.0; // 10% discount + standard shipping
//         double actual = orderService.getTotal(subtotal, hasDiscount, hasExpressShipping);

//         assertEquals(expected, actual, 0.0001);
//     }

//     @Test
//     public void testTotalWithoutDiscountAndExpressShipping() {
//         double subtotal = 100.0;
//         boolean hasDiscount = false;
//         boolean hasExpressShipping = true;

//         double expected = 100.0 + 20.0; // no discount + express shipping
//         double actual = orderService.getTotal(subtotal, hasDiscount, hasExpressShipping);

//         assertEquals(expected, actual, 0.0001);
//     }

//     @Test
//     public void testTotalWithDiscountAndExpressShipping() {
//         double subtotal = 100.0;
//         boolean hasDiscount = true;
//         boolean hasExpressShipping = true;

//         double expected = (100.0 * 0.9) + 20.0; // 10% discount + express shipping
//         double actual = orderService.getTotal(subtotal, hasDiscount, hasExpressShipping);

//         assertEquals(expected, actual, 0.0001);
//     }

//     @Test
//     public void testTotalWithZeroSubtotal() {
//         double subtotal = 0.0;
//         boolean hasDiscount = true;
//         boolean hasExpressShipping = true;

//         double expected = (0.0 * 0.9) + 20.0; // zero subtotal + express shipping
//         double actual = orderService.getTotal(subtotal, hasDiscount, hasExpressShipping);

//         assertEquals(expected, actual, 0.0001);
//     }

//     @Test
//     public void testTotalWithNegativeSubtotalThrowsException() {
//         // el test espera que se lanze una excepción IllegalArgumentException cuando el subtotal es negativo
//         double negativeSubtotal = -50.0;
//         boolean hasDiscount = true;
//         boolean hasExpressShipping = true;

//         IllegalArgumentException exception = assertThrows(
//             IllegalArgumentException.class,
//             () -> orderService.getTotal(negativeSubtotal, hasDiscount, hasExpressShipping)
//         );

//         assertEquals("Subtotal cannot be negative", exception.getMessage());
//     }
// }
