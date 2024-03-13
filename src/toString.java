// toString() is the mothod of the object class
// every class in java  inherits  this method from the Object class

//By default, the toString() method returns a string that consists of
// the class name followed by an "@" sign and the hash code of the object
// what toString is doing actually==>
// it is returning ""+getClass().getName()+ "@" + Integer.toHexString(hashCode())

class Sample{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println(s1);
        // now every time we try to print any object, it will print the Class name as the function is overridden like so
        System.out.println(s1.myToString());
    }

    // this function will return the exact same output as toString function from Object class
    public String myToString()
    {
        return ""+ getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


    // overridding the toString function

    public String toString()
    {
        return getClass().getName();
    }

}
