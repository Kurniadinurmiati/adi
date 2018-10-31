
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListObject {

	private String kelas,nama,alamat,nim;
	private int mahasiswa;
	
		public ArrayListObject(String nama,String nim,String kelas,String alamat){
			this.nama=nama;
			this.nim=nim;
			this.kelas=kelas;
			this.alamat=alamat;
			
		}
		public String getnama(){
			return nama;
		}
		public void setnama(String nama){
			this.nama=nama;
		}
		public String getkelas(){
			return kelas;
		}
		public void setkelas(String kelas){
			this.kelas=kelas;
		}
		public String getalamat(){
			return alamat;
		}
		public void setalamat(String alamat){
			this.alamat=alamat;
		}
		public String getnim(){
			return nim;
		}
		public void setnim(String nim){
			this.nim=nim;
		}
		 public int getmahasiswa() {
				return mahasiswa;
			    }
			    public void setStudentage(int mahasiswa) {
			 	this.mahasiswa = mahasiswa;
			    }	
		 public int compareTo(ArrayListObject comparestu) {
		        int compareage=((ArrayListObject)comparestu).getmahasiswa();
		        return this.mahasiswa-compareage;

		        
		    }
	 public String toString () {
	         return "[nama =" + nama + ", nim =" + nim + ", kelas =" + kelas + "]";
	 }
	public static void main(String[] args) {
		ArrayList<ArrayListObject>isi=new ArrayList<ArrayListObject>();
		isi.add(new ArrayListObject("kur","D0217372","Informatika E","SENDANA"));
		isi.add(new ArrayListObject("kur","53453453","informatika E","MAJENE"));
		isi.add(new ArrayListObject("kur","56434","informatika E","SENDANA"));
		   for(ArrayListObject str: isi){
				System.out.println(str);

	}}

}
