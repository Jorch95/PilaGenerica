package Programacion3;

public abstract class PilaAbstracta<T> {
	
	public abstract void apilar(T elem);
	public abstract T desapilar();	
	public abstract T tope();
	public abstract boolean esVacia();
	
}
