/**
 * Enum Class
 */
public enum TeamsStatus {
    AVAILABLE(1),
    BUSY(2),
    DND(3),
    BRB(4),
    AWAY(5),
    OFFLINE(6),
    LEAVE(7);

    final int value;

    TeamsStatus(int val) {
        this.value = val;
    }

    /**
     * @param teamsStatus
     * @return
     */
    public static String statusSymbolDescription(TeamsStatus teamsStatus) {
        switch (teamsStatus) {
            case AVAILABLE -> {
                return "Green Tick";
            }
            case BUSY -> {
                return "Red Circle";
            }
            case DND -> {
                return "Red Circle With White Line";
            }
            case BRB -> {
                return "Yellow Symbol";
            }
            case AWAY -> {
                return "Yellow Symbol same as BRB";
            }
            case OFFLINE -> {
                return "White Cross";
            }
            case LEAVE -> {
                return "White Cross Same as Offline";
            }
            default -> {
                return "default";
            }
        }
    }

    public int getValue() {
        return value;
    }
}

