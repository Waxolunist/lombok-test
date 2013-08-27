package lombok.delegate.test;

public interface DelegateInterface {

	public <I extends InterfaceA & InterfaceB> void methodAB(I arg);
	
	public <I extends InterfaceA> void methodA(I arg);
	
}
