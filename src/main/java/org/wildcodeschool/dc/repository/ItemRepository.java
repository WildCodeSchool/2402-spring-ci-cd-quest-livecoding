package org.wildcodeschool.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.dc.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

