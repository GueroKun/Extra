package org.example;


import java.util.ArrayList;
import java.util.List;

class Mercancia{
    Long n_envio;

    String fechaEnvio;
    String tipo;

    int peso;
    int costo;
    int distancia;

    public Mercancia(Long n_envio, String fechaEnvio, String tipo, int peso, int costo, int distancia) {
        this.n_envio = n_envio;
        this.fechaEnvio = fechaEnvio;
        this.tipo = tipo;
        this.peso = peso;
        this.costo = costo;
        this.distancia = distancia;
    }
}


class Registro{
    List<Mercancia> mercancias;

    public Registro() {
        this.mercancias = new ArrayList<>();
    }

    public void crearRegistro(Long id, String fecha, String transporte, int pesoMerca, int recorrido) {
        if (transporte.equals("Terrestre")) {
            if (pesoMerca > 0) {
                if (recorrido > 0) {
                    if (pesoMerca <= 100) {
                        int precioMe1K = 50;
                        int costo = precioMe1K * pesoMerca;
                        Mercancia mercancia = new Mercancia(id, fecha, transporte, pesoMerca, costo, recorrido);
                        mercancias.add(mercancia);
                        System.out.println("Mercancia guardada");
                    } else {
                        int precio1MeK = 40;
                        int costoMa = precio1MeK * pesoMerca;
                        Mercancia mercancia = new Mercancia(id, fecha, transporte, pesoMerca, costoMa, recorrido);
                        mercancias.add(mercancia);
                        System.out.println("Mercancia guardada");
                    }
                } else {
                    System.out.println("La discancia debe ser mayor a 0");
                }
            } else {
                System.out.println("El peso debe ser mayor a 0");
            }
        }else if (transporte.equals("Maritimo")){
            if (pesoMerca > 0) {
                if (recorrido > 0) {
                    if (pesoMerca <= 500) {
                        int precioMe1K = 100;
                        int costo = precioMe1K * pesoMerca;
                        Mercancia mercancia = new Mercancia(id, fecha, transporte, pesoMerca, costo, recorrido);
                        mercancias.add(mercancia);
                        System.out.println("Mercancia guardada");
                    } else {
                        int precio1MeK = 80;
                        int costoMa = precio1MeK * pesoMerca;
                        Mercancia mercancia = new Mercancia(id, fecha, transporte, pesoMerca, costoMa, recorrido);
                        mercancias.add(mercancia);
                        System.out.println("Mercancia guardada");
                    }
                } else {
                    System.out.println("La discancia debe ser mayor a 0");
                }
            } else {
                System.out.println("El peso debe ser mayor a 0");
            }
        }else if (transporte.equals("Aereo")){
            if (pesoMerca > 0) {
                if (recorrido > 0) {
                        int precioMe1K = 200;
                        int costo = precioMe1K * pesoMerca;
                        Mercancia mercancia = new Mercancia(id, fecha, transporte, pesoMerca, costo, recorrido);
                        mercancias.add(mercancia);
                    System.out.println("Mercancia guardada");
                } else {
                    System.out.println("La discancia debe ser mayor a 0");
                }
            } else {
                System.out.println("El peso debe ser mayor a 0");
            }
        }else {
            System.out.println("Transporte no encontrado");
        }
    }

    public void consultar(){
        System.out.println("REGISTROS:");
        for (Mercancia mercancia: mercancias){
            System.out.println("Número de envío: "+ mercancia.n_envio + ", Fecha del envío: "+ mercancia.fechaEnvio +
                    ", Tipo de transporte: "+ mercancia.tipo + ", Peso mercancia: "+ mercancia.peso + ", Costo envio: "+ mercancia.costo);
        }
    }


}

public class Main {
    public static void main(String[] args) {

       Registro registro = new Registro();

       registro.crearRegistro(1L, "18/12/2023", "Maritimo", 99, 1);
       registro.consultar();
    }
}