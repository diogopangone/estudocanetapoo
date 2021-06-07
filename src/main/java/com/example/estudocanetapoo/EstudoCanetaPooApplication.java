package com.example.estudocanetapoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoCanetaPooApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudoCanetaPooApplication.class, args);

        Caneta can = new Caneta("bic", "azul", 0.8f, true);
            //Caneta can2 = Caneta.builder().modelo("Bic").ponta(0.5f).build(); Declaração com Lombok
        can.status();
            //System.out.println("Modelo: " +can.getModelo());


    }

}
