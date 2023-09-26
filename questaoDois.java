/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
        private int temperatura;
        private boolean estado;
        public Main(){
            estado = false;
            temperatura = 80;
        }
        public boolean aumentarTemperatura(){
        if(this.estado){
            this.temperatura +=1;
            return true;
        }
        else{
            return false;
        }
    }
    
        public boolean abaixarTemperatura(){
        if(this.estado){
            this.temperatura -= 1;
            return true;
        }
        else{
            return false;
        }
    }
    
        public int getTemperatura(){
            if(estado){
                return this.temperatura;
            }
            else{
                return -1;
            }
        }
        public boolean getEstado(){
            return this.estado;
        }
        public void ligar(){
            this.estado = true;
            this.temperatura = 80;
        }
        public void desligar(){
            this.estado = false;
        }
    
    public static void main (String[] args) {
        Main main = new Main();
        main.ligar();
        //Aumentar a temperatura em 3 graus
        main.aumentarTemperatura();
        main.aumentarTemperatura();
        main.aumentarTemperatura();
        //Abaixar a temperatura em 5 graus
        for(int i = 0; i < 5;i++){
            main.abaixarTemperatura();
        }
        //Incremento 2 graus
         main.aumentarTemperatura();
         main.aumentarTemperatura();
        //mostrarTemperatura
        int mostrarTemperatura = main.getTemperatura();
        if(mostrarTemperatura == -1){
            System.out.println("Desligado");
        }
        else{
            System.out.println("A temperatura é:"+main.getTemperatura());
        }
        //ligar
        main.ligar();
        //Aumentar temperatura em 8 graus
       for(int i = 0; i < 8;i++){
            main.aumentarTemperatura();
        }
        //Abaixar temperatura em 2 graus
        main.abaixarTemperatura();
        main.abaixarTemperatura();
        //desligar
        main.desligar();
        //Mostrar temperatura
        mostrarTemperatura = main.getTemperatura();
         if(mostrarTemperatura == -1){
            System.out.println("Desligado");
        }
        else{
            System.out.println("A temperatura é:"+ main.getTemperatura());
        }
        
    }
}
