import koneksi.database;
import model.dosen;
import model.mahasiswa;
import model.matakuliah;

public class Main{
	public static void main(String [] args){
		System.out.println("Ini program main");
		database.hubungkan();
		dosen.tampilanInfo();
		mahasiswa.tampilanInfo();
		matakuliah.tampilanInfo();
	}
}