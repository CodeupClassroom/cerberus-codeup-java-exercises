package docrob;

import java.util.ArrayList;

public class Arena {
//    private ArenaCombatant [] roster = new ArenaCombatant[5];
//    private int nextEmptyRosterSlot = 0;

    private ArrayList<ArenaCombatant> roster;

    public Arena() {
        roster = new ArrayList<>();
    }

    // below here have some cool arena methods
    public void addCombatant(ArenaCombatant combatant) {
//        roster[nextEmptyRosterSlot] = combatant;
//        nextEmptyRosterSlot++;

        roster.add(combatant);
    }

    public void startFight() {
        // TODO: fill in details later
    }
}
