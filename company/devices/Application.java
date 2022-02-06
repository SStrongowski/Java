package company.devices;

public class Application  {
    public String appName;
    public String version;
    public Double price;
    public Application(String appName, String version, Double price) {
        this.appName=appName;
        this.version=version;
        if (price < 0.0){
            this.price=0.0;
        }else{
            this.price=price;
        }
       
    }

    public String toString(){
        return this.appName+" "+this.version+" "+this.price;
    }
}
