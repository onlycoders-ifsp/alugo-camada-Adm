package com.onlycoders.camadaadm;

import com.onlycoders.camadaadm.model.entity.Usuario;
import com.onlycoders.camadaadm.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CamadaAdmApplication {



	public static void main(String[] args) {
		SpringApplication.run(CamadaAdmApplication.class, args);
	}

}
