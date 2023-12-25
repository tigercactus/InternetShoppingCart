package pro.sky.InternetShoppingCart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
@Component
@SessionScope
public class Cart {
    private final Collection<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }
    public void add(Collection items){
        this.items.addAll(items);
    }
    public Collection<Item> get(){
        return new ArrayList<>(items);
    }
}
