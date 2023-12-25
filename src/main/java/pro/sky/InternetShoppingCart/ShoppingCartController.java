package pro.sky.InternetShoppingCart;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartServiceImpl scsimpl;

    public ShoppingCartController(ShoppingCartServiceImpl scsimpl) {
        this.scsimpl = scsimpl;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam("id") List<Integer> id){
        scsimpl.addItem(id);
        return "Товар добавлен в корзину";

    }
    @GetMapping("/get")
    public Collection<Item> getItem(){
        return scsimpl.getItem();
    }

}
