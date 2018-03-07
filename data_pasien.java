	class data_pasien{
		int usia=0; String nama=null,username=null,pass=null,nohp=null,goldar=null,alamat=null;
		public data_pasien(String nama,int usia,String nohp,String goldar,String alamat){
			this.nama = nama;
			this.usia = usia;
			this.nohp = nohp;
			this.goldar = goldar;
			this.alamat = alamat;
		}
		public void setNama(String nama){
			this.nama = nama;
		}
		// public void setUsername(String username){
		// 	this.username = username;
		// }
		// public void setPass(String pass){
		// 	this.pass = pass;
		// }
		public void setUsia(int usia){
			this.usia = usia;
		}
		public void setNohp(String nohp){
			this.nohp = nohp;
		}
		public void setGoldar(String goldar){
			this.goldar = goldar;
		}
		public void setAlamat(String alamat){
			this.alamat = alamat;
		}
		/////////////////////////////////////////////////////////////////
		public String getNama(){
			return nama;
		}
		// public String getUsername(){
		// 	return username;
		// }
		// public String getPass(){
		// 	return pass;
		// }
		public int getUsia(){
			return usia;
		}
		public String getNohp(){
			return nohp;
		}
		public String getGoldar(){
			return goldar;
		}
		public String getAlamat(){
			return alamat;
		}
		public String getDatansb(){
			return nama+"; "+usia+"; "+nohp+"; "+goldar+"; "+alamat;
		}
	}