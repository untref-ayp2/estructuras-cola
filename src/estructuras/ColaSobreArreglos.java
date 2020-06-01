package estructuras;

/**
 * Implementación de Cola (Queue) basada en arreglos.
 * 
 */
public class ColaSobreArreglos<T> implements Cola<T> {

    private T[] elementos;
    private int cantidad;
    private int posicionFrente;
    private int posicionFondo;

    public ColaSobreArreglos(int capacidadInicial) {
    	
    	elementos = (T[]) new Object[capacidadInicial];
    	cantidad = 0;
    	posicionFrente = 0;
    	posicionFondo = -1;
    }
    
	@Override
	public boolean estaVacia() {

		return false;
	}

	@Override
	public void acolar(T nuevoElemento) {
		
	}

	@Override
	public T desacolar() {

		return null;
	}

	@Override
	public T obtenerFrente() {

		return null;
	}
}
