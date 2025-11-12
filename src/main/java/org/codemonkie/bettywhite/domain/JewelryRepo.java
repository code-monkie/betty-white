package org.codemonkie.bettywhite.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface JewelryRepo extends JpaRepository<Jewelry,Long> {

//    Collection<Jewelry> findJewelriesByJewelryType(Type type);
//    Collection<Jewelry> findJewelriesByMaterial(String material);

}
