package regdno2241001090;

public class Address {
    String locality;
    String cityName;
    int pinCode;
    Address(String locality,String cityName,int pinCode){
        this.locality=locality;
        this.cityName=cityName;
        this.pinCode=pinCode;
    }
    void showAddress(){
        System.out.print(locality+" , "+cityName+" , "+pinCode);
    }


}
