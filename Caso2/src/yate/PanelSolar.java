package yate;

public class PanelSolar {
    
    private String modelo;
	private String brand;
	private boolean enabled;
	private float capacity;
	private float output;
	
	// constructor default
	public PanelSolar() {
		System.out.println("hola constructor default");
		this.capacity = 1000.0f;
	}
	
	public PanelSolar(String pBrand, String pModel) {
		this();
		this.brand = pBrand;
		this.modelo = pModel;
	}
	
	public PanelSolar(String pBrand, String pModel, float pCapacity, boolean pEnabled) {
		this.brand = pBrand;
		this.modelo = pModel;
		this.enabled = pEnabled;
		this.capacity = pCapacity;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean pEnabled) {
		this.enabled = pEnabled;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public float getCapacity() {
		return capacity;
	}



	public void setCapacity(float pCapacity) {
		this.capacity = pCapacity;
	}

	public float getOutput() {
		return output;
	}
}

