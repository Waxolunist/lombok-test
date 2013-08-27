package lombok.delegate.test;

import lombok.Delegate;

/**
 * Works in eclipse but not in javac.
 *
 */
public class Delegator1 implements DelegateInterface {

	@Delegate(types=DelegateInterface.class)
	DelegateClass d;

	public <I extends InterfaceA & InterfaceB> void methodAB(I arg) {
		// TODO Auto-generated method stub
		
	}

	public <I extends InterfaceA> void methodA(I arg) {
		// TODO Auto-generated method stub
		
	}
}
