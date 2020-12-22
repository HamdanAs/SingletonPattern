//class singleton
class SingleObject {

	// Membuat object dari SingleObject
	private static SingleObject instance = new SingleObject();

	// membuat private constrctor jadi class ini
	// tidak bisa di instansiasi objectnya
	private SingleObject(){}

	// hanya mengambil object yang tersedia,
	// yaitu baris kode yang ada di awal
	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World");
	}
}

//main class
class Main{
	public static void main(String[] args) {
		// constructor yang dilarang karena private
		// atau tidak bisa diakses
		// ----------------------------------------
		// Compile Time Error : SingleObject() has private access in SingleObject
		// SingleObject object = new SingleObject();

		// hanya mengambil object yang tersedia,
		// yaitu getInstance(), karena public
		SingleObject object = SingleObject.getInstance();

		// menampilkan pesan
		object.showMessage();
	}
}