package zuoye.ProxyTest;

public class PersonImplStaticProxy {
    private PersonImpl person;
    public PersonImplStaticProxy(PersonImpl person){
        this.person= person;
    }

    public void dance(){
        person.dance();
    }
}
