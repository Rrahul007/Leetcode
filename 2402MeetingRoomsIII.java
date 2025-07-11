class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> busyR = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> idleR = new PriorityQueue<>();

        for(int i = 0; i < n; i++)
        {
            idleR.offer(i);
        }

        int[] count = new int[n];

        for (int[] meeting : meetings)
        {
            int start = meeting[0], end = meeting[1];
        while(!busyR.isEmpty() && busyR.peek()[0] <= start)
        {
            idleR.offer(busyR.poll()[1]);
        }
        
        int roomID;
        if(!idleR.isEmpty())
        {
            roomID = idleR.poll();
            busyR.offer(new int[] {end, roomID});
        }
        else
        {
            int[] busyRoom = busyR.poll();
            roomID = busyRoom[1];
            busyR.offer(new int[] {busyRoom[0] + end - start, roomID});
        }
        count[roomID]++;
        }
        int mostBooked = 0;
        for(int i = 0; i < n; i++)
        {
            if(count[mostBooked] < count[i])
            {
                mostBooked = i;
            }
        }
        return mostBooked;
    }
}
