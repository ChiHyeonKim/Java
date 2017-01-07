interface InterfaceA { 
    int MAX_VALUE = 32767;
    int MIN_VALUE = -32768;
    int getMax();    int getMin();
}

interface InterfaceB { 
    int MAX_VALUE = 2147483647;
    int MIN_VALUE = -2147483648;
    int getMax();    int getMin();
}

class ClassA implements InterfaceA, InterfaceB {	//Class -> class
    public int getMax(){ return InterfaceB.MAX_VALUE; }
    public int getMin(){ return InterfaceA.MIN_VALUE; }	//getMin() Ãß°¡
}

class ClassB extends ClassA{	////Class -> class, Class B -> ClassB
    public int getMin(){ return InterfaceB.MIN_VALUE; } //int getMin() -> public int getMin()
}  

public class Interface {	//Public -> public
    public static void main(String[] args) {
        ClassA obj = new ClassB();
        System.out.println("Max="+obj.getMax()+", "+"Min="+obj.getMin()); // "Max="+getMax()+"", Min="+getMin())->"Max="+obj.getMax()+","+"Min="+obj.getMin())
    }
}
