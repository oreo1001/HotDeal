package HotDeal.HotDeal.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDto {

    @Size(min = 5, max = 14, message = "길이는 5~14로")
    String name;

    @NotNull(message = "null값은 안 됩니다")
    String productId;
}
