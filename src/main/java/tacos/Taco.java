package tacos;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
public class Taco {
private Long id;
private Date createdAt;
    
    
    @NotNull
@Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
}
