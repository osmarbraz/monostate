
import com.monostate.Monostate;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Se você vir o mesmo valor, o monostate foi reutilizado (yay!))" + "\n"
                + "Se você ver valores diferentes, então 2 monostate foram criados (booo!!)" + "\n\n"
                + "RESULTADO:" + "\n");
        
        Monostate monostate = new Monostate("Objeto1");
        Monostate outroMonostate = new Monostate("Objeto2");
        
        System.out.println(monostate.getValor());
        System.out.println(outroMonostate.getValor());
    }
}
