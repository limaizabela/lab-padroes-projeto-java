package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author limaizabela
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
//o construtor privado garante que ninguém externamente vai conseguir instanciar esse padrão de projeto	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}