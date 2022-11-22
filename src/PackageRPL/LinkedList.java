
package PackageRPL;
  
public class LinkedList {

    private DataMahasiswa head, tail;

    public LinkedList(){
        head=null;
        tail=null;
    }

    /**
     *
     */
    public void pengambilan(){
        DataMahasiswa dt= new DataMahasiswa();
        dt.input();
        if(head==null)
            head=dt;
        else
            tail.data=dt;
        tail=dt;
    }

    public void dequeue(){
        if(head==null){
            System.out.println("\n\t\t\t\t\tData Kosong!!!");
        }else{
            System.out.println("\n\t\t\t\t\tNomor antri dengan NIM : "+head.NIM+ " atas nama " +head.Nama);
            head=head.data;
        }
    }

    public void view(){
        if(head==null){
            System.out.println("\n\t\t\t\t\tData Kosong!!!");
        }else{
            System.out.println("\n\t\t\t\t==========================================================");
            System.out.println("\t\t\t\t|| NIM \t\t|| Nama \t|| Jurusan \t||");
            for (DataMahasiswa a=head; a!=null; a=a.data) a.read();
            System.out.println("\n\t\t\t\t==========================================================");

        }
    }
}