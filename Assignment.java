public class Assignment {

    public static void main(String[] args) {

        // as-7: JioFiber Plan with GST
        double jioPlan = 699;
        double gst = 18;
        double finalJioCost = jioPlan + (jioPlan * gst / 100);
        System.out.println("as-7: Final JioFiber Plan Cost = " + finalJioCost);

        // as-8: Dominos Pizza with 20% discount
        double pizzaCost = 399.0;
        int quantity = 2;
        double totalBill = pizzaCost * quantity;
        double discount = 20;
        double discountAmount = totalBill * discount / 100;
        double finalBill = totalBill - discountAmount;
        System.out.println("as-8: Final Dominos Bill = " + finalBill);

        // as-9: Tax on Vikram's Salary
        double vikramSalary = 85000;
        double taxRate = 20;
        double taxAmount = vikramSalary * taxRate / 100;
        System.out.println("as-9: Tax Amount for Vikram = " + taxAmount);

        // as-10: Simple Interest for Sarath
        double principal = 500000;
        int time = 5;
        double rate = 6.8;
        double interest = (principal * time * rate) / 100;
        double finalAmount = principal + interest;
        System.out.println("as-10: Interest Amount = " + interest);
        System.out.println("as-10: Final Amount = " + finalAmount);

        // as-11: Hima's Salary Calculation
        double basicSalary = 85000;

        double ta = 15;
        double da = 20;
        double hra = 18;
        double pf = 20;
        double tax = 25;

        double taAmount = basicSalary * ta / 100;
        double daAmount = basicSalary * da / 100;
        double hraAmount = basicSalary * hra / 100;
        double pfAmount = basicSalary * pf / 100;
        double taxAmount2 = basicSalary * tax / 100;

        double grossSalary = basicSalary + taAmount + daAmount + hraAmount;
        double netSalary = grossSalary - (pfAmount + taxAmount2);

        System.out.println("as-11: Gross Salary = " + grossSalary);
        System.out.println("as-11: Net Salary = " + netSalary);
    }
}
