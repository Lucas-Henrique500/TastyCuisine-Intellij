package inf2fm_g6.TastyCuisine.controller;

import inf2fm_g6.TastyCuisine.model.entity.Restaurante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public class restauranteController {

    @RestController
    @RequestMapping("/api/v1/rest")

    class RestauranteController{
        List<Restaurante> restaurantes = new ArrayList<>();

        @GetMapping
        public List<Restaurante> findAll(){
            Restaurante r1 = new Restaurante();
            Restaurante r2 = new Restaurante();

            r1.setNomeRestaurante("lil lixo´s restaurant");
            r1.setNomeProprietario("bigui ismouki");
            r1.setCEP("48970-000");
            r1.setCod_Restaurante(77712);
            r1.setDescricao("servimos muitas delícias, " +
                    "não nos responsabilizamos por nada que ocorre com seu corpo após a ingestão");

            r2.setNomeRestaurante("les sarrapoa president");
            r2.setNomeProprietario("sir sarrampoa third");
            r2.setCEP("06420-240");
            r2.setCod_Restaurante(12777);
            r2.setDescricao("temos cerveja e garantimos que jamais se esquecerá desta experiência, sério, vc vai lembrar da gente td dia");

            restaurantes.add(r1);
            restaurantes.add(r2);

            return restaurantes;

        }
    }
}
