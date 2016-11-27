package Proj2pkg;

public class House {

		public int address;
		public String housename;
		
		public void Laydown(){
			System.out.println("Lay down on the bed and relax");
		}
		
		public void Takeashower(){
		System.out.println("Take a shower in the morning");	
		}
		public void HouseLocation(){
			address= 4410;
			housename= "Ketcham Street";
		
			System.out.println(address+" "+housename);
			}
		
		public int Addedamount(int length,int breadth){
		
			return length*breadth;
		}
			
		
		 
		
}


