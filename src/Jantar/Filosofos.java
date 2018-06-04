/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jantar;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Filosofos{
    public class garfos extends Thread{
    private final int dir;
    private final int esq;

        public garfos(int dir, int esq) {
            this.dir = dir;
            this.esq = esq;
        }
       @Override
       public void run(){
       while(true){
       try{
           SorteioDireita();
           SorteioEsquerda();
           Thread.sleep(1000);
       }catch(InterruptedException ex){
           System.out.println(ex);
           
       }
       }
       
       }
    public void SorteioDireita(){
    int garfDir;
    Random x = new Random();
    garfDir = x.nextInt(5);
    
    System.out.println("Garfo sorteado da direita = " + x);
    }
    public void SorteioEsquerda(){
    int garfEsq;
    Random y = new Random();
    garfEsq = y.nextInt(5);
    
    System.out.println("Garfo sorteado da esquerda = " + y);
    }
    }
    public class Filosofo extends Thread{
       String nome;
       garfos garfo;
       int LugarMesa;

        public Filosofo(String nome, garfos garfo, int LugarMesa) {
            this.nome = nome;
            this.garfo = garfo;
            this.LugarMesa = LugarMesa;
            
            System.out.println("O filosofo " + this.nome + " se juntou a mesa.");
        }
       public void Pensar() throws InterruptedException{
           System.out.println("O filosofo " + this.nome + " está pensando.");
           Thread.sleep(1000);
       }
       @Override
       public void run(){
           while(true){
           if(garfo.dir == 5){
           System.out.println("O filosofo " + nome + " pegou garfo " + garfo.dir);
           if(garfo.esq == 1){
           System.out.println("O filosofo " + nome + " pegou o garfo " + garfo.esq);
           System.out.println("O filosofo " + nome + " está comendo.");
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
           System.out.println("O filosofo " + nome + " largou o garfo da esquerda.");
           }else{
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
               
               }
           }else{
            try{
                   Pensar();
                   
                }catch(InterruptedException ex){
                    Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           if(garfo.dir == 1){
           System.out.println("O filosofo " + nome + " pegou garfo " + garfo.dir);
           if(garfo.esq == 2){
           System.out.println("O filosofo " + nome + " pegou o garfo " + garfo.esq);
           System.out.println("O filosofo " + nome + " está comendo.");
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
           System.out.println("O filosofo " + nome + " largou o garfo da esquerda.");
           }else{
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
               
               }
           }else{
            try{
                   Pensar();
                   
                }catch(InterruptedException ex){
                    Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           if(garfo.dir == 2){
           System.out.println("O filosofo " + nome + " pegou garfo " + garfo.dir);
           if(garfo.esq == 3){
           System.out.println("O filosofo " + nome + " pegou o garfo " + garfo.esq);
           System.out.println("O filosofo " + nome + " está comendo.");
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
           System.out.println("O filosofo " + nome + " largou o garfo da esquerda.");
           }else{
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
               
               }
           }else{
            try{
                   Pensar();
                   
                }catch(InterruptedException ex){
                    Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           if(garfo.dir == 3){
           System.out.println("O filosofo " + nome + " pegou garfo " + garfo.dir);
           if(garfo.esq == 4){
           System.out.println("O filosofo " + nome + " pegou o garfo " + garfo.esq);
           System.out.println("O filosofo " + nome + " está comendo.");
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
           System.out.println("O filosofo " + nome + " largou o garfo da esquerda.");
           }else{
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
               
               }
           }else{
            try{
                   Pensar();
                   
                }catch(InterruptedException ex){
                    Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           if(garfo.dir == 4){
           System.out.println("O filosofo " + nome + " pegou garfo " + garfo.dir);
           if(garfo.esq == 5){
           System.out.println("O filosofo " + nome + " pegou o garfo " + garfo.esq);
           System.out.println("O filosofo " + nome + " está comendo.");
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
           System.out.println("O filosofo " + nome + " largou o garfo da esquerda.");
           }else{
           System.out.println("O filosofo " + nome + " largou o garfo da direita.");
               
               }
           }else{
            try{
                   Pensar();
                   
                }catch(InterruptedException ex){
                    Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           
           }
           }
       }
       public void test(){
         
           garfos g1 = new garfos(1, 5);
           garfos g2 = new garfos(2, 1);
           garfos g3 = new garfos(3, 2);
           garfos g4 = new garfos(4, 3);
           garfos g5 = new garfos(5, 4);
           
           Filosofo f1 = new Filosofo("Aris", g1, 1);
           Filosofo f2 = new Filosofo("Plat", g2, 2);
           Filosofo f3 = new Filosofo("Soc", g3, 3);
           Filosofo f4 = new Filosofo("Desc", g4, 4);
           Filosofo f5 = new Filosofo("Euc", g5, 5);
           
           new Thread(f1).start();
           new Thread(f2).start();
           new Thread(f3).start();
           new Thread(f4).start();
           new Thread(f5).start();
           
            }
    }

