
import java.util.*;

class Driver {
	int id;
	String name;
	String contact;
	float experience;
	Driver(int id,String name,String contact,float experience){
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.experience=experience;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getContact(){
		return contact;
	}
	public float getExperience(){
		return experience;
	}

}
  
class Truck {
	int id;
	String name;
	float totalMilesTraveledByTruck;
	Driver driver;
	Truck(int id,String name,float totalMilesTraveledByTruck,Driver driver){
		this.id=id;
		this.name=name;
		this.totalMilesTraveledByTruck=totalMilesTraveledByTruck;
		this.driver=driver;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public float getTotalMilesTraveledByTruck(){
		return totalMilesTraveledByTruck;
	}
	public Driver getDriver(){
		return driver;
	}
}

class Solution {
	public static Truck[] getAllTruckWithDistance(Truck[] truck,float distance){
		ArrayList<Truck> list=new ArrayList<>();
		for(Truck tt:truck){
			if(tt.getTotalMilesTraveledByTruck()>=distance){
            list.add(tt);
			}
		}
		if(list.size()==0) return null;
		
      Collections.sort(list,new Comparator<Truck>(){
      	public int compare(Truck t1,Truck t2){
      	return Float.compare(t2.getDriver().getExperience(),t1.getDriver().getExperience());
      	}
      });
      Truck [] result=new Truck[list.size()];
      for(int i=0;i<list.size();i++){
      	result[i]=list.get(i);

      }
      
      return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Truck[] truck=new Truck[n];
		for(int i=0;i<n;i++){
			int truckId=sc.nextInt();
			sc.nextLine();
			String truckName=sc.nextLine();
			float totalMilesTraveledByTruck=sc.nextFloat();
			sc.nextLine();

		int driverId=sc.nextInt();
		sc.nextLine();
		String driverName=sc.nextLine();
		String contact=sc.nextLine();
		float experience=sc.nextFloat();
		sc.nextLine();
		Driver driver=new Driver(driverId,driverName,contact,experience);
		truck[i]=new Truck(truckId,truckName,totalMilesTraveledByTruck,driver);

		}
       float distance=sc.nextFloat();
		Truck[] result=getAllTruckWithDistance(truck,distance);

      if(result==null) {
      	System.out.println("No truck found");
      }
     else {
     	   for(Truck tt:result){
     	   	   System.out.println(tt.getId());
                System.out.println(tt.getName());
                System.out.println(tt.getTotalMilesTraveledByTruck());

                System.out.println(tt.getDriver().getId());
                System.out.println(tt.getDriver().getName());
     	   }
     }
	}
}