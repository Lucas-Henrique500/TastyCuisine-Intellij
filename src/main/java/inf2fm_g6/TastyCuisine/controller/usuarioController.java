package inf2fm_g6.TastyCuisine.controller;

import inf2fm_g6.TastyCuisine.model.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

    @RestController
    @RequestMapping("/api/v1/usuario")
    class usuarioController {
        List<Usuario> usuarios = new ArrayList<>();

        @GetMapping
        public List<Usuario> findAll() {

            Usuario u1 = new Usuario();
            Usuario u2 = new Usuario();
            Usuario u3 = new Usuario();

            u1.setNomeCompleto("bananilson farofa");
            u1.setNomeUsuario("cabra da peste");
            u1.setIdade(12);
            u1.setCod_user(12345);
            u1.setEmail("bananilson.farofa@gmail.com");
            u1.setSenha("sabrinaCarpentero9");
            u1.setRestriAlimentares("não come banana nem fafora");

            u2.setNomeCompleto("O cartomante espacial");
            u2.setNomeUsuario("sussy baka");
            u2.setIdade(389467);
            u2.setCod_user(54321);
            u2.setEmail("O cartomante espacial@gmail.com");
            u2.setSenha("gnoseinfindável7002");
            u2.setRestriAlimentares("come de tudo, tudo mesmo");

            u3.setNomeCompleto("bruci weyne");
            u3.setNomeUsuario("batiman");
            u3.setIdade(30);
            u3.setCod_user(40301);
            u3.setEmail("eusouObatman@gmail.com");
            u3.setSenha("batcavernaCódigobinário0110");
            u3.setRestriAlimentares("apenas como coisas geladas, geladas que nem aquela noite...");

            usuarios.add(u1);
            usuarios.add(u2);
            usuarios.add(u3);

            return usuarios;


        }
    }
