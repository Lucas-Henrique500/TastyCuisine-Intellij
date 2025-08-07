package inf2fm_g6.TastyCuisine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TastyCuisineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TastyCuisineApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/v1/usuario")

	class UsuarioController {

	}

	class restauranteController{

	}



}
