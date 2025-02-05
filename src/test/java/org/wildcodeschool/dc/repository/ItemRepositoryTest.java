package org.wildcodeschool.dc.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.wildcodeschool.dc.model.Item;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void testFindAllItems() {
        // Arrange
        Item item1 = new Item();
        item1.setName("Item 1");

        Item item2 = new Item();
        item2.setName("Item 2");

        itemRepository.saveAll(List.of(item1, item2));

        // Act
        List<Item> items = itemRepository.findAll();

        // Assert
        assertThat(items).hasSize(2);
        assertThat(items.get(0).getName()).isEqualTo("Item 1");
        assertThat(items.get(1).getName()).isEqualTo("Item 2");
    }
}

