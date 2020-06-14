public class Table {
    String shape;
    String material;
    int numberOfLegs;
    int tableFor;

    Table() {
    }

    Table(String shape, String material, int numberOfLegs, int tableFor) {
        this.shape = shape;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
        this.tableFor = tableFor;
    }
}
