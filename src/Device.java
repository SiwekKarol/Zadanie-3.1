public class Device {

    String code;
    String producer;
    String type;
    double price;

Device (String cod, String pro, String typ, double prc){
    code = cod;
    producer = pro;
    type = typ;
    price = prc;
}
    Device (String cod, String pro, String typ) {
        code = cod;
        producer = pro;
        type = typ;
    }

     getInfo(){
    System.out.println(code + " " + producer + " " + type + " " + price);
    }
}
