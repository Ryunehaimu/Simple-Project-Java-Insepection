/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.junit;

/**
 *
 * @author deder
 */
public class JUNIT {

    public static void main(String[] args) {
        // Membuat objek MyShop
        MyShop shop = new MyShop();

        // Mendefinisikan daftar harga barang
        double[] itemPrices = {300, 600, 700, 400, 200};

        // Menghitung total harga dengan diskon
        double totalPrice = shop.priceCalc(itemPrices);

        // Menampilkan total harga
        System.out.println("Total harga setelah diskon: " + totalPrice);
    }
}
