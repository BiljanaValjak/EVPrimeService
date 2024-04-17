package model.responseNegativeScenarios;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostPutResponseEmptyLocation {

    String message;
    PostPutResponseEmptyLocationErrors errors;

}
