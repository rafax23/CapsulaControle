
package capsulacontrole;

/**
 *
 * @author Rafael
 */
public class ControleRemoto implements Controlador{
//implements Controlador "importa" a interface
    
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //métodos especiais
    
    //Construtor
    public ControleRemoto(int vol, boolean toca, boolean liga){
        setVolume(vol);
        setTocando(toca);
        setLigado(liga);
    };
    
    //o construtor passa seu parâmetro para o setter   
    //o setter passa seu parâmetro para o atributo do objeto de instância
    //o objeto instância da classe fica com o atributo armazenado
    
    
    //Escrever texto
    private void imp(String texto){
        System.out.println(texto);
    };
    
    //método para ver valores dos atributos
    private void ver(){
        imp("_________ Controle"
            + "\nVolume: " + getVolume() 
            + "\nTocando: "+ getTocando() 
            + "\nLigado: " + getLigado());
    }
    
    
    //Getters e Setters
    
    //SET = VOID (vazio) sem retorno
    //GET = tipo (int etc) vai retornar um tipo
    
    private void setVolume(int novoVolume){
        this.volume = novoVolume;
    }
    
    // USAR THIS OU NÃO NO RETORNO?
    private int getVolume(){
        return this.volume;
    }
    
    private void setLigado(boolean onOff){
        this.ligado = onOff;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setTocando(boolean playPause){
        this.tocando = playPause;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }

    //Metodos abstratos
    //Foram implementados pela interface Controlador
    //@Override é para programar (SUBSTIRUIR) os métodos do controlador?
    //dica: CTRL + E apaga a linha
    @Override
    public void ligar() {
        this.setLigado(true);
        imp(">>> A Tv foi ligada STATUS: " + getLigado());
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        imp(">>> A tv foi desligada STATUS: "+getLigado());
    }

    @Override
    public void abrirMenu() {
        if(getLigado()){
            ver();
        }else{
            imp(">>> Erro Abrir Menu: TV Desligada Status: " +getLigado());
        }
        //ver() está publico
        //imp() está privado - ALTEREI PARA PRIVADO
    }

    @Override
    public void fecharMenu() {
        imp(">>> Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume()+1);
            imp(">>> Mais Volume : "+ getVolume());
        }else{
            imp(">>> Erro Mais Volume: TV Desligada Status: " +getLigado());
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume()-1);
            imp(">>> Menos volume: " + getVolume());
        }else{
            imp(">>> Erro Menos volume: TV Desligada Status: " +getLigado());
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
            imp(">>> MUDO: " +getVolume());
        }else{
            imp(">>> ERRO NO MUDO - Desligado ou 'Zero'");
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(1);
            imp(">>> Remove o mudo: "+getVolume());
        }
    }

    @Override
    public void play() {
        if(getLigado() && getTocando() == false){
            setTocando(true);
            imp(">>> PLAY / Tocando: "+getTocando());
        }else{
            imp(">>> Erro PLAY: TV Desligada Status: " +getLigado());
        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
            imp(">>> PAUSE / Tocando " +getTocando());
        }else{
            imp(">>> Erro PAUSE: TV Desligada Status: " +getLigado());
        }
    }
    
    
    
    
            
    
}
