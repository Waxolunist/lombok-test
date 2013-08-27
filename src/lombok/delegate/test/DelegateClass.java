package lombok.delegate.test;

public class DelegateClass implements DelegateInterface {

	public <I extends InterfaceA & InterfaceB> void method(I arg) {};
	
}
