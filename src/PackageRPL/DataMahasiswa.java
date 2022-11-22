
package PackageRPL;

import java.util.Scanner;

public class DataMahasiswa {

    
    public String Nama,NIM, Jurusan;
    public DataMahasiswa data;

    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.print("\t\t\t\t\tMasukkan NIM           : ");
        NIM= str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan Nama          : ");
        Nama=str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan Jurusan       : ");
        Jurusan=str.nextLine();
        data=null;
    }

    public void read(){

        System.out.println("\t\t\t\t|| "+NIM+"\t|| "+Nama+" \t|| "+Jurusan+"\t\t||");

    }
} 

