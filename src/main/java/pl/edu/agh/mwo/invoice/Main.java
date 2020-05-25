package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import pl.edu.agh.mwo.invoice.product.OtherProduct;

public class Main {
	
	    public static void main(String[] args) {
	        Invoice oneInv = new Invoice();
	        oneInv.addProduct(new OtherProduct("produkt1", new BigDecimal("11.21")), 1);
	        oneInv.addProduct(new OtherProduct("produkt2", new BigDecimal("11.22")), 1);

	        Invoice secondInv = new Invoice();
	        secondInv.addProduct(new OtherProduct("dubel", new BigDecimal("1.11")), 1);
	        secondInv.addProduct(new OtherProduct("dubel", new BigDecimal("1.11")), 1);
	        secondInv.addProduct(new OtherProduct("notDubel", new BigDecimal("2.22")), 1);
	        secondInv.addProduct(new OtherProduct("dubel", new BigDecimal("1.11")), 1);
	    }

    public static void printInv(Invoice invoice) {
        System.out.println("**************************************************************"
                + "*********");
        System.out.println("<<<< Invoice nr. " + invoice.getNumber() + ">>>>");
        System.out.println("- Contents: ");
        invoice.getProducts();
        System.out.println("- Invoice summary: ");
        System.out.println("Gross total = " + invoice.getGrossTotal() + "PLN. Net total = "
                + invoice.getNetTotal() + "PLN. Tax total = " + invoice.getTaxTotal() + "PLN.");
        System.out.println("************************************************************"
                + "***********");
        System.out.println("");
    }
}