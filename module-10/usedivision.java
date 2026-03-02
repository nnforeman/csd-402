public class UseDivision {

    public static void main(String[] args) {

        // Two International divisions
        Division intDiv1 = new InternationalDivision(
                "Global Tech", 1001, "Japan", "Japanese");

        Division intDiv2 = new InternationalDivision(
                "Euro Logistics", 1002, "Germany", "German");

        // Two Domestic divisions
        Division domDiv1 = new DomesticDivision(
                "West Coast Sales", 2001, "California");

        Division domDiv2 = new DomesticDivision(
                "Midwest Operations", 2002, "Illinois");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}