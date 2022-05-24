package structural;

import structural.bridge.Api;
import structural.bridge.Format;
import structural.bridge.JsonFormat;
import structural.bridge.RestApi;

public class BridgeRunner {

    public void run() {
        Api restApi = new RestApi();
        Format format = new JsonFormat("Hello world", restApi);
        format.sendMessage();
    }
}
