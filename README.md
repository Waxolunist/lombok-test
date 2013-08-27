This repo demonstrates the bug described here:

[http://code.google.com/p/projectlombok/issues/detail?id=565]

The code compiles and delomboks correctly but in Eclipse (Kepler) it shows in the class `lombok.delegate.test.Delegator` the error on class level:

> The type Delegator must implement the inherited abstract method DelegateInterface.method(I)

This happens, if the delegate and the delegator implement the same interface.


