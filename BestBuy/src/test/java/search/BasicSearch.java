package search;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 5/7/2016.
 */
public class BasicSearch extends CommonAPI  {
     String list[]={"Laptop","Desktop","Macbook Air"};






    @Test
    public void searchProduct() throws InterruptedException{

        for (String s: list){
           clickByCss("#gh-search-input");
            Thread.sleep(1000);
            typeByCss("#gh-search-input",s);
            takeEnterKeys("#gh-search-input");
            Thread.sleep(3000);

        }
    }


}
