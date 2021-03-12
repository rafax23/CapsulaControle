
package capsulacontrole;

/**
 *
 * @author Rafael
 */
public class CapsulaControle {

    //classe principal
    public static void main(String[] args) {
        
        
        //int vol, boolean toca, boolean liga
        ControleRemoto c1 = new ControleRemoto(5, false, false);
        //c1.ligar();
        c1.abrirMenu();
        c1.maisVolume();
        c1.menosVolume();
        c1.ligarMudo();
        c1.desligarMudo();
        c1.play();
        c1.pause();
        c1.ligar();
        //c1.desligar();
        c1.abrirMenu();
                
        //ontroleRemoto c2 = new ControleRemoto(10, true, true);
        //c2.abrirMenu();
                
    }
    
}
