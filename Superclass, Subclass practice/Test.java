class a {  public void behave() { System.out.print("a"); } }
class b extends a { public void behave() { System.out.print("b"); }}
class c extends a { public void behave() { System.out.print("c"); }	}
class d extends a { public void behave() { System.out.print("d"); }	}

public class Test {
   static void paint(a p) {p.behave(); System.out.println("-1");	}
   static void paint(b p) {p.behave(); System.out.println("-2");	}
   static void paint(c p) {p.behave(); System.out.println("-3");	}
   static void paint(d p) {p.behave(); System.out.println("-4");	}

	public static void main(String[] args) {
	    paint(new a());
	    paint(new b());
	    paint(new c());
	    paint(new d());
	}
}
