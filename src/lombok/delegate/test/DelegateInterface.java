package lombok.delegate.test;

public interface DelegateInterface {

	public <I extends InterfaceA & InterfaceB> void method(I arg);
	
}
