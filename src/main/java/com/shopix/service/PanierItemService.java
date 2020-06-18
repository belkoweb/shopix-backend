package com.shopix.service;

import java.util.Collection;

import com.shopix.beans.Panier;
import com.shopix.beans.PanierItem;

public interface PanierItemService {

public int save(Panier panier, Collection<PanierItem> panierItems);

}
