package br.com.hackathonfc.park.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.hackathonfc.park.domain.Estacionamento;
import br.com.hackathonfc.park.domain.Veiculo;
import br.com.hackathonfc.park.repositories.EstacionamentoRepository;
import br.com.hackathonfc.park.repositories.VeiculoRepository;

@Configuration
@Profile("test")
public class Testeconfig implements CommandLineRunner {
	
	@Autowired
	private EstacionamentoRepository estacionamentoRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Estacionamento est1 = new Estacionamento(null, "Seu José", "jose@mail.com", "12345", "12345678912345", "São paulo", "Rua teste", "Numero 32", "Fcarmaa", "32255689", 2, 8, "Lava Rapido");
		Estacionamento est2 = new Estacionamento(null, "Seu José", "jose@mail.com", "12345", "12345876412345", "São paulo", "Rua teste", "Numero 32", "Fcarmaa", "32255689", 2, 8, "Lava Rapido");
		
		Veiculo v1 = new Veiculo(null, "pegeout", "206", "prata", "ghd7956", "Carro");
		Veiculo v2 = new Veiculo(null, "fiat", "uno", "prata", "jot7956", "Carro");
				
		estacionamentoRepository.saveAll(Arrays.asList(est1, est2));
	}
}
