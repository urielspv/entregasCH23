package hilos.formathread;

public class Hilo2 implements Runnable {
    private String nombre;
    public Hilo2(String nombre) {
        super();
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        System.out.println("Inicio de El Thread "+ this.getNombre());
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + nombre);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}