// by default the methods of the interfaces are public

interface Voter{
    void castVote();
}

interface EC{
    void checkValidityOfVoter(int age)throws myException;
}

class ECIndia implements Voter, EC{
    int minAge;
    ECIndia(){}
    ECIndia(int minAge){
        this.minAge = minAge;
    }

    public void castVote(){}
    public void checkValidityOfVoter(int age)throws myException{
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
    public static void main(String[] args)throws myException {
        ECIndia obj = new ECIndia(18);
        obj.checkValidityOfVoter(24);
        obj.checkValidityOfVoter(4);
        ECBrazile obj2 = new ECBrazile();
        obj2.checkValidityOfVoter(24);
    }
}

class myException extends Exception{
    myException(String error){
        super(error);
    }
}