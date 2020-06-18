package com.shopix.service;

import java.util.Collection;

import com.shopix.beans.Commande;
import com.shopix.beans.CommandeItem;

public interface CommandeItemService {
 public int save(Commande commande,Collection<CommandeItem> collection);
}
