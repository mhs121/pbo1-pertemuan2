import java.until.scanner;
public class InputOutput{
	public static void main(String [] args){
		scanner scanner = new scanner(System.in);
		String nama;
		System.out.print("masukan nama anda : ");
		nama = scanner.nextLine();
		System.out.println("Hai, "+nama);
	}
}