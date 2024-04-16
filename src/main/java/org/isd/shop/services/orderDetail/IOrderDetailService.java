package org.isd.shop.services.orderDetail;

import org.isd.shop.entities.Order;
import org.isd.shop.responses.OrderDetail.OrderDetailResponse;

import java.util.List;

public interface IOrderDetailService {

    OrderDetailResponse createOrderDetail(Long userId, Long productId);

    OrderDetailResponse getOrderDetailById(Long id);

    List<OrderDetailResponse> getOrderDetailsByOrderId(Long orderId);
}
