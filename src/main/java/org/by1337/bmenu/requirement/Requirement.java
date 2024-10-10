package org.by1337.bmenu.requirement;

import org.bukkit.entity.Player;
import org.by1337.blib.chat.Placeholderable;
import org.by1337.bmenu.Menu;

public interface Requirement {
    boolean test(Menu menu, Placeholderable placeholderable, Player clicker);
}
