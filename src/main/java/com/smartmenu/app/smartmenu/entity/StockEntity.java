package com.smartmenu.app.smartmenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {

	@Id
	@Column(name = "idstock")
	private Long idstock;

	@Column(name = "codtienda")
	private int codtienda;

	@Column(name = "codplato")
	private int codplato;

	@Column(name = "cantidaddisponible")
	private int cantidaddisponible;

	@Column(name = "stockinicial")
	private int stockinicial;

	public Long getIdstock() {
		return idstock;
	}

	public void setIdstock(Long idstock) {
		this.idstock = idstock;
	}

	public int getCodtienda() {
		return codtienda;
	}

	public void setCodtienda(int codtienda) {
		this.codtienda = codtienda;
	}

	public int getCodplato() {
		return codplato;
	}

	public void setCodplato(int codplato) {
		this.codplato = codplato;
	}

	public int getCantidaddisponible() {
		return cantidaddisponible;
	}

	public void setCantidaddisponible(int cantidaddisponible) {
		this.cantidaddisponible = cantidaddisponible;
	}

	public int getStockinicial() {
		return stockinicial;
	}

	public void setStockinicial(int stockinicial) {
		this.stockinicial = stockinicial;
	}

}
