public class TableTest {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.shape = "okrągły";
        table1.material = "drewno";
        table1.numberOfLegs = 4;
        table1.tableFor = 8;
        Table table2 = new Table();
        table2.shape = "owalny";
        table2.material = "tworzywo";
        table2.numberOfLegs = 3;
        table2.tableFor = 5;

        System.out.println("Rodzaje stołów");
        System.out.println("Pierwszy:");
        System.out.printf("  %-20s%s\n", "Kształt", table1.shape);
        System.out.printf("  %-20s%s\n", "Użyty materiał", table1.material);
        System.out.printf("  %-20s%d\n", "Liczba nóg", table1.numberOfLegs);
        System.out.printf("  %-20s%d\n", "Liczba osób", table1.tableFor);
        System.out.println("Drugi:");
        System.out.printf("  %-20s%s\n", "Kształt", table2.shape);
        System.out.printf("  %-20s%s\n", "Użyty materiał", table2.material);
        System.out.printf("  %-20s%d\n", "Liczba nóg", table2.numberOfLegs);
        System.out.printf("  %-20s%d", "Liczba osób", table2.tableFor);
    }
}
