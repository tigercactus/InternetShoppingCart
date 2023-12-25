package pro.sky.InternetShoppingCart;

import java.util.Collection;
import java.util.List;

public interface ShoppingCartService {
    public void addItem(List<Integer> id);
    public Collection<Item> getItem();
}
