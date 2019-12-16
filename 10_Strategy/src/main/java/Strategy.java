public interface Strategy {

    /**
     * @return 获取下一局要出的手势
     */
    Hand nextHand();

    /**
     * 学习“上一局的手势是否赢了。如果上一局的手势获胜了，就调用study(true)。就调用study(false)”
     *
     * @param win
     */
    void study(boolean win);
}
