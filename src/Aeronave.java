

public class Aeronave {


    private String modelo;
    private int Serie;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getSerie() {
        return Serie;
    }
    public void setSerie(int serie) {
        Serie = serie;
    }
    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", Serie=" + Serie + "]";
    }
    
    

   



}

    



