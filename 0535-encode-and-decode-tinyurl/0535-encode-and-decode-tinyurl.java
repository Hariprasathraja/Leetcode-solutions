public class Codec {
    private ConcurrentHashMap<Long,String>map=new ConcurrentHashMap<>();
    private AtomicLong counter=new AtomicLong();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        long id=counter.incrementAndGet();
        map.put(id,longUrl);
        return "http://tinyurl.com/"+id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Long.parseLong(shortUrl.substring("http://tinyurl.com/".length())));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));