public class Codec {
    private Map<Integer,String>map=new HashMap<>();
    private int counter;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(counter,longUrl);
        return "http://tinyurl.com/"+counter++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.substring("http://tinyurl.com/".length())));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));