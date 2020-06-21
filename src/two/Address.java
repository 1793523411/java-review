package two;

public class Address {
    String name;
    int gateNumber;
    String streetName;
    String city;
    String province;
    String postalCode;
    private int streetNumber;

    //方法成员略
    public static void main(String args[]) {
        Address address1 = new Address(), address2 = new Address();
        address1.name = "Zhang Li";
        address1.streetNumber = 15;
        address1.streetName = "Tsinghua East Road";
        address1.city = "Beijing";
        address1.province = "Beijing";
        address1.postalCode = "100084";
        address2.name = "Li Hong";
        address2.streetNumber = 2;
        address2.streetName = "BeiNong";
        address2.city = "Beijing";
        address2.province = "Beijing";
        address2.postalCode = "102206";
        //...do something interesting
    }

}

