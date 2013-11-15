package kata5;

public class Mail {
    
    private String addres;

    public Mail(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }
    
    public String getDomain (){
        return addres.split("@")[1];
    }
    
}
