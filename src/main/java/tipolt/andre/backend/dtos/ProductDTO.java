package tipolt.andre.backend.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    
    private String name;

    private Long spotPrice;

    private Long fowardPrice;

    private Long categoryId;

}
