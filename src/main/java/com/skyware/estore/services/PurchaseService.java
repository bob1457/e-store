package com.skyware.estore.services;

import com.skyware.estore.models.PurchaseHistory;
import com.skyware.estore.repository.IPurchaseHistoryRepository;
import com.skyware.estore.repository.projections.IPurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseService implements IPurchaseService
{
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory SavePurchaseHistory(PurchaseHistory purchaseHistory)
    {
        purchaseHistory.setPurchaseDateTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> FindPurchaseItemOfUser(Long userId)
    {
        return purchaseHistoryRepository.findAllPurchasedItemsOfUser(userId);
    }
}
