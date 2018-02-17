public class Proxy implements ProxyServiceIF {
    boolean online = false;
    private ProxyService ps = new ProxyService();
    public String getBestPerformer() {
        if(online)
            return "Too bad";
        else
            return ps.getBestPerformer();
    }
}
