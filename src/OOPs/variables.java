package OOPs;

interface variables {

    int rice = 5; //public + static + final
    void purchase(); // public + abstract
}
class seller implements variables
{
    @Override
    public void purchase()
    {
        //rice = 5 is final
        System.out.println("Seller needs "+ rice +" kg Rice");
    }

    static void main(String[] args) {
        variables x = new seller();
        x.purchase();
        System.out.println(variables.rice);//Static
    }
}

