package doitfast.customtype;


import doitfast.domainobjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {

    @ParameterType(".*")
    public Product product(String name){
        Product p = new Product(name.replace("\"", ""));
       // System.out.println(p.getName());
        return p;
    }

//    public static void main(String[] args) {
//        CustomParameterType cp = new CustomParameterType();
//        cp.product("brajesh");
//    }
}
