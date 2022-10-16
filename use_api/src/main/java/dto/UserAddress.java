package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 21:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phone;
    private String isDefault;
}
