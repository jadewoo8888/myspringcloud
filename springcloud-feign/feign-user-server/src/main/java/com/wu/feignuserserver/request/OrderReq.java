package com.wu.feignuserserver.request;

import javax.validation.constraints.NotNull;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/22 16:42
 **/
public class OrderReq {

    @NotNull(message = "订单编码不能为空")
    private Integer code;
    //@NotBlank(message = "商品名字不能为空")
    private String productName;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrderReq{" +
                "code=" + code +
                ", productName='" + productName + '\'' +
                '}';
    }
}
