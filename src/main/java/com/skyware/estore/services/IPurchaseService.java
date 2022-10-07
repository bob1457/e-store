package com.skyware.estore.services;

import com.skyware.estore.models.PurchaseHistory;
import com.skyware.estore.repository.projections.IPurchaseItem;

import java.util.List;

public interface IPurchaseService {
    PurchaseHistory SavePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> FindPurchaseItemOfUser(Long userId);
}
