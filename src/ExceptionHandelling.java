class ExceptionHandelling{
    public static void main (String  ...args) {
        try{
            Thread.sleep(1000);
            System.out.println(args[0]);
        }
//        catch(Exception e)
//        {
//            System.out.println("Exception has occored");
//        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("inside catch block");
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception has occored");
        }
        catch(Exception e)
        {
            System.out.println("Exception has occored");
        }
        //System.out.println(args[0]);
    }
}
