package Day7;

import java.util.Comparator;

public class playerAgeComparator implements Comparator<player> {

    @Override
    public int compare(player firstPlayer, player secondPlayer) {
       return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
    }

}