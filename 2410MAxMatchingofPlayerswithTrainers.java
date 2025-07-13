class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int answer = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        for(int i = 0; i < trainers.length; ++i)
        {
            if(players[answer] <= trainers[i] && ++answer == players.length)
            {
                return answer;
            }
        }
        return answer;
    }
}
