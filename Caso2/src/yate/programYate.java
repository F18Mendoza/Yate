package yate;

public class programYate {


	public static void main(String[] args) {
		Bateria bateria = new Bateria();
		Bateria otrabateria = new Bateria();
		
		bateria.setBrand("Nokia");
		otrabateria.setBrand("Samsung");
		
		Bateria another = otrabateria;
		
	another.setBrand("Motorola");
		
/*			System.out.println("bateria -> "+bateria.getBrand());
		System.out.println("otrabateria -> "+otrabateria.getBrand());
		System.out.println("another -> "+another.getBrand());
		
		System.out.println("=======================================");
*/		
		PanelSolar panel = new PanelSolar("Samsumg", "ABC");
		panel.setEnabled(true);
		System.out.println(panel.getCapacity() + " " +panel.getModelo());
/*		
		PanelSolar panel2 = new PanelSolar("SuperEnergia", "SE 2030");
		System.out.println(panel2.getCapacity() + " " +panel2.getModelo());
	*/	
				
		bateria.conectarPanel(panel);
		bateria.cargarBateria();
	
		
	}
}
