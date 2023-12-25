package pro.sky.InternetShoppingCart;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service

public class ShoppingCartServiceImpl implements ShoppingCartService{

    private final Cart cart;

    public ShoppingCartServiceImpl( Cart cart) {
        this.cart = cart;
    }
    private final Map<Integer, Item> items = Map.of(
            1, new Item(1),
            2, new Item(2),
            3, new Item(3));

    @Override
    public void addItem(List<Integer> ids) {
        cart.add(ids
                .stream()
                .map(id ->items.get(id))
                .collect(Collectors.toList()));
    }

    @Override
    public Collection<Item> getItem() {
        return cart.get();
    }
}
