package com.example.estudocanetapoo;


//@Data
//@AllArgsConstructor //Relacionado ao Lombok, que realiza os Get e Seter, alem de construtor
//@Builder
public class Caneta {

   public String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;


   public Caneta(String m, String c, float p, boolean b) { //Esse é o metodo construtor, pois ele tem o mesmo nome da classe

      this.modelo = m;
      this.cor = c; //esse não tem o Get e Set, por isso está como .cor
      this.ponta = p; //esse tem o Get e Set, por isso está como .setPonta
      this.tampar();
      }

      public String getModelo (){
         return this.modelo;
      }
      public void setModelo (String mod){
         this.modelo = mod;
      }

      public float getPonta (){
         return this.ponta;
      }

      public void setPonta ( float pon){
         this.ponta = pon;
      }
      public void tampar (){
         this.tampada = true;
      }
      public void destampar (){
         this.tampada = false;
      }
      public void status (){
         System.out.println("Referências da Caneta:");
         System.out.println("Modelo: " + this.getModelo());
         System.out.println("Tamanho da Ponta: " + this.getPonta());
         System.out.println("Cor: " + this.cor);
         System.out.println("Tampada: " + this.tampada);
      }
   }



