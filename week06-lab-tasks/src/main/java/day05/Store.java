package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> products= new ArrayList<>();

    public void addProducts(Product product){
        products.add(product);
    }

    private List<Type> typesInStore(){
        List<Type> types=new ArrayList<>();
        for (Product p :
                products) {
            if (!types.contains(p.getType())) {
                types.add(p.getType());
            }
        }
        return types;
    }

    public List<Integer> sameTypeAmount(){
        List<Type> types = typesInStore();
        List<Integer> amounts= new ArrayList<>();
        for(int i = 0;i<types.size();++i){
            amounts.add(0);
        }
        for (int i = 0;i<products.size();++i){
            for (int j = 0;j< types.size();++j){
                if(products.get(i).getType().equals(types.get(j))){
                    amounts.set(j, amounts.get(j)+1);
                }
            }
        }
        return amounts;
    }
}
