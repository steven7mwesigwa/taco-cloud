package tacos.data;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
import tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
