package lombok.delegate.test;

import lombok.Delegate;

/**
 * Works in javac but not in eclipse.
 */
public class Delegator2 implements DelegateInterface {

	@Delegate(types=DelegateInterface.class)
	DelegateClass d;
}
