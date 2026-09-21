import java.util.*;
class Footwear {

    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName,String footwearType,int price) {
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;
    }

   
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

   
}


public class FootwearProgrammm {

  
    public static int getCountByType(Footwear[] footwears, String footwearType) {
       int count = 0;
       for(Footwear f : footwears) {
            if(f.getFootwearType().equalsIgnoreCase(footwearType)){
                count++;
            }
        }
           return count;
    }

public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears,String inputFootwearName) {
        ArrayList<Footwear> list = new ArrayList<>();
               for (Footwear f : footwears) {
            if (f.getFootwearName().equalsIgnoreCase(inputFootwearName)) {
                list.add(f);
            }
        }
           if (list.size() == 0) {
            return null;
        }

        list.sort((a, b)->b.getPrice()-a.getPrice());

     
        if(list.size() < 2) {
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
            sc.nextLine();

            footwears[i] = new Footwear(id, name, type, price);
        }

        String inputType = sc.nextLine();
        String inputBrand = sc.nextLine();


        int count = getCountByType(footwears, inputType);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }


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