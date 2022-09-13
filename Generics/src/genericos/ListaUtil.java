package genericos;

import java.util.List;

public class ListaUtil {
	public static Object getUltimo1 (List<?> lista) {
		return lista.get(lista.size()-1);
	}
	public static <T>T getUltimo2 (List<T> lista) {
		return lista.get(lista.size()-1);
	}
	
	public static<A, B, C> B teste(A parametroA, C parametroC) {
        B teste = null;
        return teste;
    }
}
