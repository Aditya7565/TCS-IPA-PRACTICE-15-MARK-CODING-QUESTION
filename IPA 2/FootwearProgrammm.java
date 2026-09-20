import java.util.*;

class Footwear {

    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    // Parameterized constructor
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // Getters
    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class FootwearProgrammm {

    // Method 1: Count footwear by type
    public static int getCountByType(Footwear[] footwears, String footwearType) {

        int count = 0;

        for (Footwear f : footwears) {
            if (f.getFootwearType().equalsIgnoreCase(footwearType)) {
                count++;
            }
        }

        return count;
    }


    // Method 2: Find second highest price by brand
    public static Footwear getSecondHighestPriceByBrand(
            Footwear[] footwears, String inputFootwearName) {

        ArrayList<Footwear> list = new ArrayList<>();

        // Find footwear having matching brand
        for (Footwear f : footwears) {
            if (f.getFootwearName().equalsIgnoreCase(inputFootwearName)) {
                list.add(f);
            }
        }

        // No brand found
        if (list.size() == 0) {
            return null;
        }

        // Sort by price in descending order
        list.sort((a, b) -> b.getPrice() - a.getPrice());

        // If only one footwear is present,
        // there is no second highest
        if (list.size() < 2) {
            return null;
        }

        return list.get(1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Footwear[] footwears = new Footwear[5];

        for (int i = 0; i < footwears.length; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String type = sc.nextLine();

            int price = sc.nextInt();

            footwears[i] = new Footwear(id, name, type, price);
        }

        String inputType = sc.nextLine();
        String inputBrand = sc.nextLine();


        // Calling getCountByType
        int count = getCountByType(footwears, inputType);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }


        // Calling getSecondHighestPriceByBrand
        Footwear result = getSecondHighestPriceByBrand(
                footwears, inputBrand);

        if (result != null) {
            System.out.println(result.getFootwearId());
            System.out.println(result.getFootwearName());
            System.out.println(result.getPrice());
        } else {
            System.out.println("Brand not available");
        }

        sc.close();
    }
}