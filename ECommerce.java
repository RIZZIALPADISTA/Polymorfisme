package rizzi.ti23e;

import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        
        System.out.println("======PILIH PRODUCT======");
        System.out.println("1. Laptop");
        System.out.println("2. Baju");
        System.out.println("3. Susu");
        
        Scanner sc = new Scanner(System.in);
        String ulang = "Y";
        do{
            System.out.println("Isikan Kode Barang: ");
            int kode = sc.nextInt();
            if(kode == 1){
                System.out.println("Isikan Nama Barang: ");
                String name = sc.next();
                System.out.println("Isikan Harga Barang: ");
                double price = sc.nextDouble();
                System.out.println("Isikan Lama Barang: ");
                int warranty = sc.nextInt();
                
                Electronic laptop = new Electronic(name, price, warranty);
                laptop.infoProduct();
            }
            if(kode == 2){
                System.out.println("Isikan Nama Barang: ");
                String name = sc.next();
                System.out.println("Isikan Harga Barang: ");
                double price = sc.nextDouble();
                System.out.println("Isikan Ukuran Barang: ");
                String size = sc.next();
                System.out.println("Isikan Material Barang; ");
                String material = sc.next();
                
                Clothes baju = new Clothes(name, price, size, material);
                baju.infoProduct();
            }
            if(kode == 3){
                System.out.println("Isikan Nama Makanan: ");
                String name = sc.next();
                System.out.println("Isikan Harga Makanan: ");
                double price = sc.nextDouble();
                System.out.println("Isikan Tanggal Expired Makanan: ");
                String expired = sc.next();
                
                Food susu = new Food(name, price, expired);
                susu.infoProduct(); 
            }
            System.out.println("Apakah anda mau belanja lagi? (Y/N)");
            ulang = sc.next();            
        }while(ulang.equals("Y")|| ulang.equals("y"));    
    }
}
