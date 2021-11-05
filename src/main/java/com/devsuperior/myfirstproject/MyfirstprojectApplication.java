package com.devsuperior.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Descricao;
import com.devsuperior.myfirstproject.entities.Transacao;
import com.devsuperior.myfirstproject.entities.formaPagamento;
import com.devsuperior.myfirstproject.repositories.DescricaoRepository;
import com.devsuperior.myfirstproject.repositories.FormaPagamentoRepository;
import com.devsuperior.myfirstproject.repositories.TransacaoRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	@Autowired
	private DescricaoRepository descricaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		formaPagamento fp1 = new formaPagamento(null, "AVISTA", "1"); 
		formaPagamento fp2 = new formaPagamento(null, "PARCELADO LOJA", "6");
		formaPagamento fp3 = new formaPagamento(null, "PARCELADO EMISSOR", "12");
		
		Descricao d1 = new Descricao(null, "50.00", "01/05/2021 18:30:00", "PetShop Mundo cão", "123456789-0", "1472569", "AUTORIZADO");
		Descricao d2 = new Descricao(null, "50.00", "01/05/2021 18:30:00", "Mercado Jon", "666663333-0", "1472569", "NEGADO");
		Descricao d3 = new Descricao(null, "50.00", "01/05/2021 18:30:00", "Restaurante do zé", "88888999-0", "1472569", "AUTORIZADO");
		
		Transacao t1 = new Transacao(null, "4444*******1234", fp1,d1);
		Transacao t2 = new Transacao(null, "1111*******1234", fp2,d2);
		Transacao t3 = new Transacao(null, "2222*******1234", fp3,d3);
		Transacao t4 = new Transacao(null, "4444*******1234", fp2,d1);
		
		fp1.getTransactions().addAll(Arrays.asList(t1,t4));
		
		
		formaPagamentoRepository.save(fp1);
		formaPagamentoRepository.save(fp2);
		formaPagamentoRepository.save(fp3);
		descricaoRepository.save(d1);
		descricaoRepository.save(d2);
		descricaoRepository.save(d3);
		transacaoRepository.save(t1);
		transacaoRepository.save(t2);
		transacaoRepository.save(t3);
		

	}
}
