package lombok.delegate.test;

public class DelegateClass implements DelegateInterface {

	public <I extends InterfaceA & InterfaceB> void methodAB(I arg) {};
	
	public <I extends InterfaceA> void methodA(I arg) {};
}
