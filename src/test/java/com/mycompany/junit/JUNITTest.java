/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author deder
 */
public class JUNITTest {
    
    public JUNITTest() {
    }
    @org.junit.jupiter.api.Test
    public void testPriceCalc_3_item_dibawah_500_diskon3x() {
        MyShop myShop = new MyShop();
        
        // Test case 1: Total harga dengan diskon 3 item dibawah 500
        double[] itemPrices1 = {400.0, 300.0, 450.0};
        double expectedTotal = 920.0; // (320 + 240 + 360)
        assertEquals(expectedTotal, myShop.priceCalc(itemPrices1), 0.01); // Using delta for double comparison
    }
    @org.junit.jupiter.api.Test
    public void testPriceCalc_3_item_diatas_500_tidakdiskon() {
        MyShop myShop = new MyShop();
        
        // Test case 2: total harga dengan tidak dapat diskon (semua item diatas 500)
        double[] itemPrices2 = {600.0, 750.0, 900.0};
        double expectedTota2 = 2250.0; // (600 + 750 + 900)
        assertEquals(expectedTota2, myShop.priceCalc(itemPrices2), 0.01);
    }
    @org.junit.jupiter.api.Test
    public void testPriceCalc_2_item_dibawah_500_tidakdiskon_1_item() {
        MyShop myShop = new MyShop();
        
        // Test case 2: total harga dengan tidak dapat diskon (semua item diatas 500)
        double[] itemPrices3 = {400.0, 350.0, 900.0};
        double expectedTota3 = 1500.0; // (600 + 750 + 900)
        assertEquals(expectedTota3, myShop.priceCalc(itemPrices3), 0.01);
    }
}
