package invariantsubtype;

public class Main {
  public static void main(String[] args) {
    MyList<A> lst = new MyList<>();
    lst.add(new A());
    lst.add(new B());
    lst.add(new C());
    System.out.println(lst);

    MyList<B> lstB = new MyList<>();
    lstB.add(new B());
    //lstB.add(new C());
    //lstB.add(new A());
    System.out.println(lstB);

    //lst.addAll(lstB);
    System.out.println(lst);

    // Whilst B isa A
    // MyList<B> is not a subtype of My List<A>
  }
}
