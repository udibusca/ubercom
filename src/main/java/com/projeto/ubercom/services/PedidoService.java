package com.projeto.ubercom.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.ubercom.domain.Pedido;
import com.projeto.ubercom.repositores.PedidoRepository;
import com.projeto.ubercom.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id Pedido : " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
