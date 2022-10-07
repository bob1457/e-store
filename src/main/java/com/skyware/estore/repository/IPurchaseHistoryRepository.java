package com.skyware.estore.repository;

import com.skyware.estore.models.PurchaseHistory;
import com.skyware.estore.repository.projections.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long>
{
    @Query("select " +
    "b.Title as title, ph.Price as price, ph.PurchaseDateTime as purchasedateTime " +
    "from PurchaseHistory as ph left join Book b on b.Id = ph.BookId " +
    "where ph.UserId =:userId")
    List<IPurchaseItem> findAllPurchasedItemsOfUser(@Param("userId") Long userId);
}
