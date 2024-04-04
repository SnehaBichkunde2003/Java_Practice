// by default the methods of the interfaces are public

interface Voter{
    void castVote();
}

interface EC{
    void checkValidityOfVoter(int age)throws Exception;
}

class ECIndia implements Voter, EC{
    int minAge;
    ECIndia(){}
    ECIndia(int minAge){
        this.minAge = minAge;
    }

    public void castVote(){}
    public void checkValidityOfVoter(int age){
        if(age<minAge){
            throw new myException("Invalid Age");
        }
    }
}

class ECBrazile implements Voter, EC{
    public ECBrazile(){}
    public void castVote(){}
    public void checkValidityOfVoter(int age){}


}

class InterfacesAndException {
    public static void main(String[] args) {
        ECIndia obj = new ECIndia(18);
        obj.checkValidityOfVoter(24);
        obj.checkValidityOfVoter(4);
        ECBrazile obj2 = new ECBrazile();
        obj2.checkValidityOfVoter(24);
    }
}

class myException extends RuntimeException{
    myException(String error){
        super(error);
    }
}