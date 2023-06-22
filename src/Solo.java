import Planta.Planta;
import Semente.Semente;

public class Solo {
        String tipoSolo;
        boolean fertil;
        String cor;
        //Método
    public Planta gerarPlanta(Semente semente){
        return new Planta(Semente semente);

    }

}
