import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class kesehatan{
	ArrayList <data_pasien> arrData = new ArrayList<>();

	//Scanner input = new Scanner(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(isr);

	public static void main(String[]args){
		System.out.println("\nSELAMAT DATANG DI APLIKASI KESEHATAN IDEAL");
		kesehatan orang = new kesehatan();
		orang.awalan();
	}
public void awalan(){
	try{
		int x;
	do{
	
	System.out.println("\n                            =====Siapakah anda?=====");
	System.out.println("                                  1.USER");
	System.out.println("                                  2.ADMIN");
	System.out.println("                            ========================");
	System.out.print("                            Masukkan pilihan anda :");
	x = Integer.parseInt(input.readLine());
	switch (x){
		case 1 :
		masuk();
		break;
		case 2 :
		admin();
		break;
						// case 9 :
						// adminarea();
						// break;
		default :
		System.out.println("\n                       ! ! ! ! ! Inputan Salah ! ! ! ! !");
		
		}
	}
	while (x != 1 || x!=2);
}
		catch (Exception e){
				System.out.println(e);
		}
	}

public void admin(){
	try{
	System.out.println("			    ======LOGIN ADMIN======");	
	System.out.print("			    Masukkan username :");
	String username = input.readLine();
	System.out.print("			    Masukkan Password :");
	String pass = input.readLine();

	if(username.equals("admin")&&pass.equals("admin")){
		System.out.println("Selamat Datang Admin");
		adminarea();
	}
	else{
		System.out.println("\n                    =======Username dan kata sandi salah=======");
		awalan();
	}
	}catch (Exception e) {
        //e.printStackTrace();
        System.out.println(e);
    }
	
}
public void adminarea(){
    try {
    	int f;
    	do{
    	System.out.println("\n                            ******MENU ADMIN*******");
    	System.out.println("                                 1. Data Pasien    ");
        System.out.println("                                 2. Keluar         ");
        System.out.println("                            ***********************");
        System.out.print("                            Masukkan Pilihan Anda :");
        f = Integer.parseInt(input.readLine());
        switch(f){
        	case 1 :
        	report();
        	break;
        	case 2 :
        	awalan();
        	break;
        }
}
		while (f != 1 || f!=2);

    } catch (Exception e) {
        //e.printStackTrace();
        System.out.println(e);
    }
}
public void login(){
	/*try{
		String p;
		String user;
		String pass2;
		System.out.println("Apakah Anda Sudah Memiliki Akun? Y/T");
		System.out.print("Jawaban Anda : ");
		p = input.readLine();
		if(p.equals ("Y")||p.equals ("y")){
			System.out.println("\nSILAHKAN MASUK");
			System.out.print("Username :");
			user = input.readLine();
			System.out.print("Password :");
			pass2 = input.readLine();
			if(user.equals (user)&& pass2.equals (pass2)){
				menu();
			}

			else{
				System.out.println("Username dan Password anda salah !");
				System.out.println("Harap Coba Lagi Atau Buat Akun Baru");
				login();
			}
		}

		else if (p.equals ("T")||p.equals ("t")){
			System.out.println("Silahkan Buat Akun");
			masuk();
		}
		else{
			System.out.println("\nInputan Salah");
			login();
			}
	}
	catch (Exception e){
				System.out.println(e);
	}
}*/
masuk();
}
public void masuk(){
	try{
			String nama;
			String username;
			String pass;
			int usia;
			String nohp;
			String goldar;
			String alamat;
			
			System.out.println("\n                       ------BUAT AKUN MEMBER BARU------");
			System.out.print("                       Masukkan Nama :");
			nama = input.readLine();
			//System.out.print("Masukkan Username :");
			//username = input.readLine();
			//System.out.print("Masukkan Password :");
			//pass = input.readLine();
			System.out.print("                       Masukkan Usia :");
			usia = Integer.parseInt(input.readLine());
			System.out.print("                       Masukkan No HP :");
			nohp = input.readLine();
			System.out.print("                       Masukkan Golongan Darah :");
			goldar = input.readLine();
			System.out.print("                       Masukkan Alamat :");
			alamat = input.readLine();
			System.out.println("\n                     ------BIODATA BERHASIL DISIMPAN------");
			arrData.add(new data_pasien(nama,usia,nohp,goldar,alamat));	
			menu();
	}
	catch (Exception e){
				System.out.println(e);
	}
	
}

public void menu(){
	try{
		int pilihan;
		System.out.println("\n                    ======SELAMAT DATANG DI APLIKASI KESEHATAN IDEAL======");
		System.out.println("\n                           *************** MENU ******************");
		System.out.println("                           * 1. Berat Badan Ideal                *");
		System.out.println("                           * 2. Perkiraan Maksimal Tinggi Badan  *");
		System.out.println("                           * 3. Kalkulatur Denyut Jantung        *");
		System.out.println("                           * 4. Keluar                           *");
		System.out.println("                           ***************************************");
		System.out.print("                                 Masukkan Pilihan Anda : ");
		pilihan = Integer.parseInt(input.readLine());
		switch(pilihan){
			case 1 :
			berat();
			break;
			case 2 :
			tinggi();
			break;
			case 3:
			darah();
			break;
			case 4:
			System.out.println("TERIMAKASIH TELAH MENGGUNAKAN APLIKASI KAMI");
			awalan();
			break;
			default:
			System.out.println("                              ! ! ! ! ! Inputan Salah ! ! ! ! !");
			menu();
		}
	}
	catch (Exception e){
				System.out.println(e);
	}
}

public void report(){
	try{
	if (arrData.size() == 0){
		System.out.println("\n                       ==========PASIEN BELUM ADA==========");
	}
	else{
				System.out.println("\nPasien Sebanyak : "+arrData.size());
					//nama,username,pass,usia,nohp,goldar,alamat
				for(int a = 0 ; a < arrData.size();a++){
					String nama2 = arrData.get(a).getNama();
					//String username2 = arrData.get(a).getUsername();
					//String pass2 = arrData.get(a).getPass();
					int usia2 = arrData.get(a).getUsia();
					String nohp2 = arrData.get(a).getNohp();
					String goldar2 = arrData.get(a).getGoldar();
					String alamat2 = arrData.get(a).getAlamat();

					System.out.println("\n===DATA PASIEN===");
					System.out.println((a+1)+"\tNama            : "+nama2);
					//System.out.println("\tUsername : "+username2);
					//System.out.println("\tPassword : "+pass2);
					System.out.println("\tUsia            : "+usia2+" tahun");
					System.out.println("\tNo.HP           : "+nohp2);
					System.out.println("\tGolongan Darah  : "+goldar2);
					System.out.println("\tAlamat          : "+alamat2);
			}
				}      
		}

		
		catch (Exception e){
				System.out.println(e);
		}
		adminarea();
}

public void berat(){
		try{
				double tinggi;
				double berat_ideal;
				int berat_sekarang;
				int s1, s2;
				String saran1, saran2;

				System.out.println("Selamat Datang Di Berat Badan Ideal");
				System.out.print("\nMasukkan Berat Badan Anda Sekarang : ");
				berat_sekarang = Integer.parseInt(input.readLine());
				System.out.print("Masukkan Tinggi Badan Anda Sekarang : ");
				tinggi =  Integer.parseInt(input.readLine());
				berat_ideal = ((tinggi-100)-((tinggi-100)*0.1));
				System.out.println("Berat ideal anda antara "+Math.round((berat_ideal-1))+"kg sampai "+Math.round((berat_ideal+1))+"kg");
				System.out.println("\nSetelah Melakukan perhitungan maka : ");
				if(berat_sekarang<berat_ideal-1){
					System.out.println("Berat badan anda sangat kurang");
					System.out.println("\nUntuk mencapai berat ideal anda, sebaiknya anda menambah berat badan minimal "+Math.round(((berat_ideal-1)-berat_sekarang))+"kg");
					System.out.println("\nApakah Anda Butuh Saran Untuk Menambah Berat Badan Anda? Y/T");
					System.out.print("Jawaban Anda : ");
					saran1 = input.readLine();
					if(saran1.equals ("Y")||saran1.equals ("y")){
						System.out.println("1. Saran Makanan?");
						System.out.println("2. Saran Pola Hidup?");
						System.out.print("\nMasukkan pilihan anda : ");
						s1 = Integer.parseInt(input.readLine());
						switch(s1){
							case 1 : 
								System.out.println("BERIKUAT ADALAH MAKANAN YANG DAPAT MEMBANTU ANDA DALAM MENAMBAH BERAT BADAN : ");
								System.out.print("1. Daging Merah\n2. Susu Sapi\n3. Selai Kacang\n4. Buah-buahan Tropis\n5. Alpukat\n6. Roti Gandum\n7. Mentega\n8. Kacang-kacangan\n9. Keju\n10. Kentang\n");
							break;
							case 2 : 
								System.out.println("BERIKUT ADALAH POLA HIDUP YANG DAPAT MEMBANTU ANDA DALAM MENAMBAH BERAT BADAN : ");
								System.out.println("1. Tingkatkan porsi dan makan lebih sering\n2. Mengkonsumsi makanan kaya protein (kualitas bukan kuantitas)\n3. Lebih sering mengkonsumsi makanan berkalori tinggi\n4. Hindari minum sebelum makan\n5. Perbanyak cemilan atau ngemil\n6. Tidur yang cukup dan teratur\n7. Olahraga secara teratur");
							break;
							default:
								System.out.println("Maaf Inputan Salah");
						}
					}
				}
				else if(berat_sekarang>(berat_ideal+1)){
					System.out.println("Berat badan anda sangat berlebihan");
					System.out.print("Untuk mencapai berat ideal anda, sebaiknya anda mengurangi berat badan minimal "+Math.round((berat_sekarang-(berat_ideal+1)))+"kg");
					System.out.println("Apakah Anda Butuh Saran Untuk Menurunkan Berat Badan Anda?Y/T");
					System.out.print("Jawaban Anda : ");
					saran2 = input.readLine();
					if(saran2.equals("Y")||saran2.equals("y")){
						System.out.println("1. Saran Makanan");
						System.out.println("2. Saran Pola Hidup");
						s2 = Integer.parseInt(input.readLine());
						switch(s2){
							case 1 :
								System.out.println("BERIKUT ADALAH POLA HIDUP YANG DAPAT MEMBANTU ANDA DALAM MENURUNKAN BERAT BADAN : ");
								System.out.println("1. Dark chocolate\n2. Kentang rebus dingin\n3. Telur saat sarapan\n4. Sayuran hijau\n5. Buah apel dan pir sebelum makan\n6. Alpukat setelah makan siang\n7. Yogurt");
							break;
							case 2 :
								System.out.println("BERIKUT ADALAH POLA HIDUP YANG DAPAT MEMBANTU ANDA DALAM MENURUNKAN BERAT BADAN : ");
								System.out.println("1. Olahraga\n2. Diet Sehat\n3. Istirahat yang Cukup\n4. Jangan Sampai Stres\n5. Mengonsumsi Jenis Rempah\6. Pijatan\7. Kurangi Porsi Makan dan Makan Lebih Sering\n8. Hindari Konsumsi Minuman Bersoda\n9. Hindari Konsumsi Gorengan\n7. Banyak Minum Air Putih");
							break;
							default :
								System.out.println("Maaf Inputan Salah");
						}
					}
				}
				else{
					System.out.println("Berat badan anda ideal");
				}
				lanjut();
		}
		catch (Exception e){
				System.out.println(e);
		}
	}

public void tinggi(){
	try{
		double prediksi_min, prediksi_max;
		double tinggi_ayah;
		double tinggi_ibu;
		int kelamin;
		
		System.out.println("Selamat Datang Di Prediksi Tinggi Badan");

		System.out.println("\nJenis Kelamin : ");
		System.out.println("1. Laki-Laki");
		System.out.println("2. Perempuan");
		System.out.print("Jenis Kelamin 1 / 2 : ");
		kelamin = Integer.parseInt(input.readLine());
		if(kelamin==1){
			System.out.println("\nSilahkan Masukkan Data Dibawah : ");
		}
		else if(kelamin==2){
			System.out.println("\nSilahkan Masukkan Data Dibawah : ");
		}
		
		System.out.print("Masukkan Tinggi Badan Ayah : ");
		tinggi_ayah = Integer.parseInt(input.readLine());

		System.out.print("Masukkan Tinggi Badan Ibu : ");
		tinggi_ibu = Integer.parseInt(input.readLine());

		if (kelamin==1){
			prediksi_max = ((tinggi_ayah+tinggi_ibu)/2)+13+8.5;
			prediksi_min = ((tinggi_ayah+tinggi_ibu)/2)+13-8.5;
			System.out.println("\nDengan demikian, perkiraan tinggi badan anda berada di kisaran "+Math.round(prediksi_min)+"cm hingga "+Math.round(prediksi_max)+"cm.");
		}
		else if(kelamin==2){
			prediksi_max = ((tinggi_ayah+tinggi_ibu)/2)-13+8.5;
			prediksi_min = ((tinggi_ayah+tinggi_ibu)/2)-13-8.5;
			System.out.println("\nDengan demikian, perkiraan tinggi badan anda berada di kisaran "+Math.round(prediksi_min)+"cm hingga "+Math.round(prediksi_max)+"cm.");
		}
		lanjut();
	}
	catch (Exception e){
				System.out.println(e);
		}
	
}

public void darah(){
	try{
		int detak;
		double hasil;
		double rata_detak;
		double jumlah_detak = 0;
		String saran1;
		int s1;
		
		System.out.println("Selamat Datang Di Perhitungan Denyut Jantung");
		System.out.println("\nCARA PENGGUNAAN :");
		System.out.println("1. Pastikan anda dalam keadaan rileks atau istirahat dan duduk");
		System.out.println("2. Tempatkan telunjuk dan jari tengah di bawah pangkal jembol");
		System.out.println("3. Rasakan denyut nadi sampai dapat atau tekan lembut jari Anda sampai Anda merasakan denyut nadi di bawah jari Anda");
		System.out.println("4. Hitung denyut nadi Anda dalam 10 detik sebanyak 3x");
		System.out.println("5. Masukkan denyut nadi pertama, kedua, dan ketiga");
		System.out.println("");

		for(int a = 1; a <= 3; a++){
			System.out.print("Masukkan Denyut Nadi Ke-"+a+"  : ");
			detak = Integer.parseInt(input.readLine());
			jumlah_detak = jumlah_detak + detak;
		}
		rata_detak = (jumlah_detak/3);
		hasil = rata_detak*6;
		System.out.println("Rata-Rata Detak jantung :"+Math.round(rata_detak));
		System.out.println("Detak Jantung Anda :"+Math.round(hasil)+"/menit");
		System.out.println("DARI HASIL PERHITUNGAN DAN PREDIKSI :");
		if(hasil<60){
			System.out.println("Denyut jantung anda sangat RENDAH");
			saranjantungrendah();
		}
		else if(hasil>100){
			System.out.println("Denyut jantung anda sangat TINGGI");
			sarandenyuttinggi();
	}
		else{
			System.out.println("Denyut jantung anda NORMAL");
		}
		lanjut();
	}	
	catch (Exception e){
				System.out.println(e);
		}
}

public void lanjut(){
	try{
			String pil;
		System.out.println("\nAPAKAH ANDA INGIN LANJUT ? Y/T");
		System.out.print("Jawaban Anda : ");
		pil = input.readLine();
		switch(pil){
			case "Y":
			menu();
				break;
			case "y":
			menu();
				break;
			case "T":
			System.out.println("#######Terimakasih#######");
			awalan();
				break;
			case "t":
			System.out.println("#######Terimakasih#######");
			awalan();
				break;
			default :
			System.out.println("! ! ! ! ! Inputan Salah ! ! ! ! !");
			lanjut();
				break;
				
		}

	}
	catch (Exception e){
				System.out.println(e);
		}
}
public void denyuttinggi(){
	try{
		int s1;
	
			System.out.println("1. Saran Makanan");
			System.out.println("2. Saran Pola Hidup");
			System.out.println("3. Metode Memperlambat Detak Jantung yang Sangat Tinggi ");
			System.out.println("4. Memperbaiki Detak Jantung Secara Permanen");
			System.out.println("5. Memperlambat Detak Jantung yang Kronis Tinggi");
			System.out.println("6. Tips");
			System.out.print("Jawaban Anda : ");
			s1 = Integer.parseInt(input.readLine());
		switch(s1){
			case 1 :
				System.out.println("\nBERIKUT ADALAH MAKANAN UNTUK MENORMALKAN DENYUT JANTUNG ANDA");
				System.out.println("1. Yogurt\n2. Pisang\n3. Bawang Putih\n4. Kacang-kacangan\n5. Tahu\n6. Ikan\n7. Oatmeal");
			break;
			case 2 :
				System.out.println("\nBERIKUT ADALAH POLA HIDUP UNTUK MENJAUHKAN ANDA DARI DENYUT JANTUNG YANG TIDAK NORMAL");
				System.out.println("1. Jangan abaikan tanda dan gejala yang muncul\n2. Pola makan harus dijaga\n3. Melakukan olahraga rutin\n4. Jauhkan cangkir kopi dari Anda");
			break;
			case 3 :
				System.out.println("\nBERIKUT LATIHAN YANG BISA ANDA MENORMALKAN DENYUT JANTUNG ANDA");
				System.out.println("1. Berlatihlah pernapasan panjang\n2. Lakukan gerakan valsava\n3. Lakukan gerakan karotid\n4. Perciki diri Anda dengan air dingin\n5. Minumlah obat-obatan");
			break;
			case 4 :
				System.out.println("\nBERIKUT ADALAH METODE MEMPERBAIKI DETAK JANTUNG YANG BISA ANDA COBA");
				System.out.println("1. Konsultasikan dengan dokter, hingga tingkat manakah Anda boleh berolahraga keras\n2. Perbanyak tidur yang berkualitas\n3. Kosongkan kandung kemih Anda secara teratur\n4. Minumlah kapsul minyak ikan\n5. Ubahlah pola makan Anda");
			break;
			case 5 :
				System.out.println("\nBERIKUT ADALAH METODE UNTUK MEMPERLAMBAT DETAK JANTUNG YANG KRONIS TINGGI");
				System.out.println("1. Berbaring dan bersantailah\n2. Konsentrasilah pada gambaran mental yang menyenangkan\n3. Belajarlah bermeditasi\n4. Bernapaslah pelan-pelan\n5. Nikmati pijatan");
			break;
			case 6 :
				System.out.println("\nBERIKUT ADALAH TIPS YANG BISA ANDA COBA UNTUK MENORMALKAN DETAK JANTUNG ANDA : ");
				System.out.println("Kunjungi dokter Anda untuk menjalani biofeedback variabilitas detak jantung\nDalam sesi biofeedback ini,\nAnda akan dipasangi sensor elektrik yang memungkinkan Anda mengamati detak jantung\nKemudian, Anda dapat berusaha menurunkan detak jantung dengan pikiran Anda untuk\nmeningkatkan kapasitas paru-paru Anda, menurunkan tekanan darah dan juga stres.");
			break;
			default :
				System.out.println("Inputan Anda Salah");
					
			}
			saranlagi();
	}
	catch (Exception e){
				System.out.println(e);
		}
		
	}
public void saranlagi(){
	try{
		String s3;
		System.out.println("\nApakah anda butuh saran lagi?Y/T");
		System.out.print("\nJawaban Anda : ");
		s3 = input.readLine();
		switch(s3){
			case "Y":
			denyuttinggi();
			break;
			case "y":
			denyuttinggi();
			break;
			case "T":
			lanjut();
			case "t":
			lanjut();
		}
	}
	catch (Exception e){
				System.out.println(e);
		}
	
	}
public void sarandenyuttinggi(){
	try{
		String s3;
		System.out.println("\nAPAKAH ANDA BUTUH SARAN UNTUK MENINGKATKAN DENYUT JANTUNG ANDA?");
		System.out.print("\nJawaban Anda : ");
		s3 = input.readLine();
		switch(s3){
			case "Y":
			denyuttinggi();
			break;
			case "y":
			denyuttinggi();
			break;
			case "T":
			lanjut();
			case "t":
			lanjut();
		}
	}
		catch (Exception e){
				System.out.println(e);
		}
}
public void denyutrendah(){
		try{
			int s2;

			System.out.println("1. Saran Makanan");
			System.out.println("2. Pola Hidup");
			System.out.println("3. Metode Meningkat Detak Jantung Yang Rendah");
			System.out.println("4. Cara Mengatasi Jantung Rendah Secara Alami ");
			System.out.println("5. Cara Pencegahan Detak Jantung Rendah ");
			System.out.print("Jawaban anda : ");
			s2 = Integer.parseInt(input.readLine());
			switch(s2){
				case 1 : 
					System.out.println("\nBERIKUT ADALAH MAKANAN UNTUK JANTUNG SEHAT YANG DAPAT MENSTABILKAN DENYUT JANTUNG ATAU NADI");
					System.out.println("1. Kalsium\n2. Magnesium\n3. Asam lemak omega-3\n4. Kalium\n5. Sayuran berdaun hijau\n6. Makanan berserat\n7. Minyak Zaitun\n8. Teh Hijau\n9. Wine\n10. Biji-bijian");
				break;
				case 2 : 
					System.out.println("\nBEBERAPA POLA HIDUP YANG BISA ANDA TERAPKAN UNTUK MENINGKATKAN DETAK JANTUNG ANDA YANG LEMAH");
					System.out.println("1. Kurangi berat nadam jika Anda tergolong mengalami obesitas\n2. Mulailah kebiasaan olahraga yang tidak berlalu berat bagi jantung\n3. Hentikan kebiasan merokok\n4. Atau waktu dengan baik demi mendapatkan waktu tidur yang cukup\n5. Perhatikan asupan makanan dengan menerapkan diet setiap hari, termasuk mengurangi kadar garam dan sodium\n6. Perhatikan asupan makanan dengan menerapkan diet sehat tiap hari, termasuk mengurangi kadar garam dan sodium\n7. Hindari stres\n8. Jadwalkan kunjungan rutin ke dokter untuk membantu kondisi kesehatan atau jika Anda mengidap penyakit lain di saat bersamaan");
				break;
				case 3 : 
					System.out.println("\nBERIKUT INI ADALAH METODE UNTUK MENINGKATKAN DETAK JANTUNG YANG RENDAH");
					System.out.println("1. Ubah cara duduk anda\n3. Lakukan peregangan otot\n3. Berjalan\n4. Melakukan yoga atau tai chi\n5. Jogingn\n6. Berenang\n7. Bersepeda\n8. Lompat tali\n9. Push-up\n10. Melakukan olahraga jongkok");
				break;
				case 4 : 
					System.out.println("\nAda beberapa cara alami yang bisa di gunakan untuk mengatasi penyakit jantung lemah secara alami. Salah satunya adalah :");
					System.out.println("1. Menghindari makanan yang memacu darah tinggi\n2. Mengurangi konsumsi garam\n3. Menghindari stress\n4. Perbanyak makan zat besi\n5. Bahaya radikal bebas tinggi\n6. Istirahat yang cukup\n7. Hindari kebiasaan merokok\n8. Hindari melakukan aktivitas berat\n9. Jangan tegang\n10. Control emosi dalam keadaan stabil\n11. Mengurangi makanan yang mengandung kolestrol tinggi\n12. Berolahraga yang teratur\n13. Konsumsi blueberry1\n4. Konsumsi the hijau\n15. Mengkonsumsi manggis\n16. Hindari makanan dan minuman yang mengandung kafein");
				break;
				case 5 : 
					System.out.println("\nBERIKUT BEBERAPA CARA YANG BISA ANDA COBA UNTUK MENCEGAH DETAK JANTUNG RENDAH");
					System.out.println("1. Melakukan Olahraga Ringan\n2. Hindari dan Berhenti Merokok\n3. Memperoleh Berat Badan yang Proporsional\n4. Mengurangi Kadar Lemak pada Tubuh\n5. Waspadai Penyakit Lain yang Berkaitan dengan Jantung\n6. Menggantikan Konsumsi Makanan Pabrik dengan Makanan Berbahan Dasar Herbal");
				break;
				default :
					System.out.println("Inputan anda salah");
			}
			saranjantungrendahlagi();
		}
		catch (Exception e){
				System.out.println(e);
		}
}
public void saranjantungrendah(){
	try{
		String s3;
		System.out.println("\nAPAKAH ANDA BUTUH SARAN UNTUK MENORMALKAN DENYUT JANTUNG ANDA?Y/T");
		System.out.print("Jawaban Anda : ");
		s3 = input.readLine();
		switch(s3){
			case "Y":
			denyutrendah();
			break;
			case "y":
			denyutrendah();
			break;
			case "T":
			lanjut();
			case "t":
			lanjut();
		}
	}
		catch (Exception e){
				System.out.println(e);
		}
}
public void saranjantungrendahlagi(){
	try{
		String s3;
		System.out.println("\nApakah anda butuh saran lagi?Y/T");
		System.out.print("Jawaban Anda : ");
		s3 = input.readLine();
		switch(s3){
			case "Y":
			denyutrendah();
			break;
			case "y":
			denyutrendah();
			break;
			case "T":
			lanjut();
			case "t":
			lanjut();
		}
	}
	catch (Exception e){
				System.out.println(e);
		}
}
}
	
