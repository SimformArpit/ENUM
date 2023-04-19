/**
 * Example Class
 */
public class Example {
    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {

        String symbolDescription = TeamsStatus.statusSymbolDescription(TeamsStatus.AVAILABLE);
        System.out.println(symbolDescription);
        for (TeamsStatus a :
                TeamsStatus.values()) {
            System.out.println("Status Name: " + a + ", Symbol Description: " + TeamsStatus.statusSymbolDescription(a));
        }
    }
}