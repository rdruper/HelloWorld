package br.edu.uniritter.examples;

public class Conta {
	int _numero;
	float _saldo;
	
	public Conta(int numero) {
		_numero = numero;		
	}
	
	public Conta(int numero, float saldo) {
		_numero = numero;
		_saldo += saldo;
	}
	
	public void depositar(float quantia) {
		_saldo += quantia;
	}
	
	public void sacar(float quantia) {
		if (_saldo >= quantia) _saldo -= quantia;
	}
	
	public float verificaSaldo() {
		return _saldo;
	}
	
	public int retornaNumeroConta() {
		return _numero;
	}
}
