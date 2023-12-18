package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testCaso1(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Terrestre", 6, 10);
        assertEquals(1, registro.mercancias.size());
    }

    @Test
    public void testCaso2(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Aereo", 6, 1000);
        assertEquals(1, registro.mercancias.size());
    }

    @Test
    public void testCaso3(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Terrestre", 99, 10);
        for (Mercancia mercancia: registro.mercancias){
            if (mercancia.tipo.equals("Terrestre")){
                if (mercancia.peso <= 100) {
                    assertEquals(4950, mercancia.costo);
                    return;
                }
                else {
                    System.out.println("error");
                }
            }
        }
        fail("Transporte no encontrado");
    }

    @Test
    public void testCaso4(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Terrestre", 101, 10);
        for (Mercancia mercancia: registro.mercancias){
            if (mercancia.tipo.equals("Terrestre")){
                if (mercancia.peso > 100) {
                    assertEquals(4040, mercancia.costo);
                    return;
                }
                else {
                    System.out.println("error");
                }
            }
        }
        fail("Transporte no encontrado");
    }

    @Test
    public void testCaso5(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Maritimo", 500, 10);
        for (Mercancia mercancia: registro.mercancias){
            if (mercancia.tipo.equals("Maritimo")){
                if (mercancia.peso <= 500) {
                    assertEquals(50000, mercancia.costo);
                    return;
                }
                else {
                    System.out.println("error");
                }
            }
        }
        fail("Transporte no encontrado");
    }
@Test
    public void testCaso6(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Maritimo", 501, 10);
        for (Mercancia mercancia: registro.mercancias){
            if (mercancia.tipo.equals("Maritimo")){
                if (mercancia.peso > 500) {
                    assertEquals(40080, mercancia.costo);
                    return;
                }
                else {
                    System.out.println("error");
                }
            }
        }
        fail("Transporte no encontrado");
    }


@Test
    public void testCaso7(){
        Registro registro = new Registro();
        registro.crearRegistro(1L, "18/12/2023", "Aereo", 100, 10);
        for (Mercancia mercancia: registro.mercancias){
            if (mercancia.tipo.equals("Aereo")) {
                assertEquals(20000, mercancia.costo);
                return;
            }else {
                    System.out.println("error");
                }
            }
        fail("No encontrado");
        }
    }
