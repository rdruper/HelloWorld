import br.edu.uniritter.examples.Conta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ContaTest {
	
	Conta conta;
	
	@Before
	public void setUp() {
		conta = new Conta(1,100);
	}

	
	@Test
	public void testRetornaNumeroConta() {
		assertEquals(1, conta.retornaNumeroConta());
	}
	
	@Test
	public void testVerificaSaldo() {
		assertEquals(100, conta.verificaSaldo(),0.01);
	}
	
	@Test
	public void testDepositar() {
		conta.depositar(100);
		assertEquals(200, conta.verificaSaldo(), 0.01);
	}

	@Test
	public void testSacar() {
		conta.sacar(50);
		assertEquals(50, conta.verificaSaldo(), 0.01);
	}



}
