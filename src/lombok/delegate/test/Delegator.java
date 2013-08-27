package lombok.delegate.test;

import lombok.Delegate;

public class Delegator implements DelegateInterface {

	@Delegate
	DelegateClass d;
	
}
