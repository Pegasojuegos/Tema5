
public class CarreraBicis {
	
 public static void main(String[] args) {
	BicicletaMontaña miBicicleta = new BicicletaMontaña(10, 3, 5);
	BicicletaTandem tuBicicleta = new BicicletaTandem(10,3,3);
	Bicicleta bicicleta3 = new Bicicleta();
	Bicicleta Participantes[] ={miBicicleta,tuBicicleta,bicicleta3};
	
	
	miBicicleta.acelerar();
	tuBicicleta.acelerar();
	
	System.out.println(miBicicleta.getVelocidadActual());
	System.out.println(tuBicicleta.getVelocidadActual());
	System.out.println();
	
	miBicicleta.acelerarB();
	tuBicicleta.acelerarB();
	
	System.out.println(miBicicleta.getVelocidadActual());
	System.out.println(tuBicicleta.getVelocidadActual());
	System.out.println();
	
	for(Bicicleta i:Participantes) {
		i.acelerar();
	}
	
	System.out.println(miBicicleta.getVelocidadActual());
	System.out.println(tuBicicleta.getVelocidadActual());
	System.out.println(bicicleta3.getVelocidadActual());
 }
}
