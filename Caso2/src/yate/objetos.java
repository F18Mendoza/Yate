package yate;

public class objetos {

    public float television = 0.2f;
    public float cocina = 0.3f;
    public float ducha = 0.2f;

    public void energiaConsumida(){
        Bateria bateria = new Bateria();
        bateria.consumirEnergia(television);
        bateria.consumirEnergia(cocina);
        bateria.consumirEnergia(ducha);
        
    }
    
}

