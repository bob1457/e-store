package com.skyware.estore.repository.projections;

import java.time.LocalDateTime;

public interface IPurchaseItem
{
    String getTitle();

    Double getPrice();

    LocalDateTime getPurchaseDateTime();
}
