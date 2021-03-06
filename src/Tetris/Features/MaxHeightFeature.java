package Tetris.Features;

import Tetris.PotentialNextState;

public class MaxHeightFeature extends Feature {

    @Override
    public double getValue(PotentialNextState state) {
        double max = 0;

        int[] tops = state.getTop();

        for (int i = 0; i < tops.length; i++) {
            max = Math.max(max, tops[i]);
        }

        if (state.hasLost()) {
            return Double.MAX_VALUE;
        }
        return max;
    }

}
