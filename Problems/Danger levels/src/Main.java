enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    final int level;

    DangerLevel(int dangerLevel) {
        this.level = dangerLevel;
    }

    public int getLevel() {
        return level;
    }

//    public static void main(String[] args) {
//        DangerLevel high = DangerLevel.HIGH;
//        DangerLevel medium = DangerLevel.MEDIUM;
//
//        System.out.println(high.getLevel() > medium.getLevel());
//    }
}