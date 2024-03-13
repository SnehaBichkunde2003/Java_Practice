// new keyword only takes one argument i.e. constructor

class Sample1{
   public int Sanple1(int i)
   {
       return i;
   }
   // as constructor do nat have any return type
    // this will be treated as the normal method

    public static void main(String[] args) {
       // Sample1 s1 = new Sample1(5);
        // error: as new keyword only take constructor as the parameter
        // but here int Sample(int ) is a method not a constructor
        /*
        *constructor Sample1 in class Sample1 cannot be applied to given types;
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
        * */
    }
}
