
package PackageRPL;
  
  class Laptop {
  String pemilik;
  String hidupkanLaptop() {
    return "Hidupkan Laptop";
  }
};
 
class BelajarJava {
 
  public static void main(String args[]){
     
    Laptop laptopAnto = new Laptop();
    Laptop laptopAndi = new Laptop();
    Laptop laptopDina = new Laptop();
  
    laptopAnto.pemilik = "Anto";
    laptopAndi.pemilik = "Andi";
    laptopDina.pemilik = "Dina";
    
    System.out.println("Pemilik Laptop: " + laptopAnto.pemilik);
    System.out.println("Pemilik Laptop: " + laptopAndi.pemilik);
    System.out.println("Pemilik Laptop: " + laptopDina.pemilik);
 
  }
   
}

