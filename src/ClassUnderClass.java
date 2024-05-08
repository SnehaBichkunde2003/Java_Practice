class className {
    String name;
    className(){}
    className(String name)
    {
        this.name = name;
    }
    class insideClass{
        String name;
        insideClass(){}
        public insideClass(String name)
        {
            this.name = name;
        }
        // static block
        static {
            System.out.println("insideClass Staic block");
        }
        // init block
        {
            System.out.println("insideClass init block");
        }
        public void displayInfo(String name)
        {
            System.out.println(name);
            System.out.println(this.name);
            // what internally happens here is that internally it takes classname for that perticular class
            // that is (here) insideClass.this.name
            // we also can provide the class name
            System.out.println(className.this.name);
        }
    }


    static {
        System.out.println("className Staic block");
    }
    // init block
    {
        System.out.println("className init block");
    }

    public static void main(String[] args) {
        className obj = new className();
        insideClass obj2 = obj.new insideClass();
        System.out.println(obj);
        System.out.println(obj2);
    }
}

class Fun{

    public static void main(String[] args) {
        className obj1 = new className("sggs");
        className.insideClass obj2 = obj1.new insideClass("IT dept");
        className.insideClass obj3 = obj1.new insideClass("IT dept");
        System.out.println(obj2);
        //System.out.println(name);
        obj2.displayInfo("Sneha"+" FUN");
    }

}