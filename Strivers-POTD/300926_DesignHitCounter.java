class HitCounter {
    Deque<Hit> queue;
    int totalHits;

    public HitCounter() {
        queue = new ArrayDeque<>();
        totalHits = 0;    
    }
    
    public void hit(int timestamp) {
        if(! queue.isEmpty() && queue.peekLast().timestamp == timestamp){
            queue.peekLast().count++;
        }else{
            queue.offerLast(new Hit(timestamp,1));
        }
        totalHits++;
    }
    
    public int getHits(int timestamp) {
        int expiry = timestamp - 300;
        while(! queue.isEmpty() && queue.peekFirst().timestamp <= expiry){
            Hit front = queue.pollFirst();
            totalHits -= front.count;
        }
        return totalHits;
    }
    
    class Hit{
        int timestamp;
        int count;

        Hit(int timestamp, int count){
            this.timestamp = timestamp;
            this.count = count;
        }
    }
}
