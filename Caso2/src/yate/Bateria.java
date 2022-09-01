package yate;

public class Bateria {

    public boolean enabled;
	private float energyLevel;
	private String brand; 
	private PanelSolar panel;
	private boolean charging = false;


	public void encender() {
		enabled = true;
	}
	
	public void apagar() {
		this.enabled = false;
	}
	
	public float consumirEnergia(float pRequest) {
		float result = 0.0f;
		
		if (energyLevel>pRequest) {
			result = pRequest;
			energyLevel = energyLevel - pRequest;  // energyLevel-=pRequest;
		}
		
		return result;
	}

	public void setBrand(String pBrand) {
		this.brand = pBrand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	private void alertBreakCircuit() {
		this.enabled = false;
	}
	
	public void conectarPanel(PanelSolar pPanel) {
		this.panel = pPanel;
	}
	
	public void detenerCarga() {
		charging = false;
	}
	
	public void cargarBateria() {
		if (this.panel!=null && this.panel.isEnabled()) {
			charging = true;
			int cuenta = 0;
			for(;charging;) {
				try {					
					energyLevel+=panel.getCapacity()/1000.0f;
					Thread.sleep(1000); // esperar o dormir por un segundo, 1000 milliseconds
					System.out.println("Nivel actual de bateria "+energyLevel);
					System.out.println("Nivel actual del panel "+panel.getCapacity());
					
					cuenta++;  // codigo para hacer la prueba del capacity
					if (cuenta>10) {
						panel.setCapacity(panel.getCapacity()-5);
					}
					if (cuenta>20) {
						this.detenerCarga();
					}
				} 
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} else {
			System.out.println("No puedo cargar la batería porque no hay un panel conectado");
		}
	}
}
    
