package Utils;

import Utils.Factory.SendMessage;

import java.util.HashMap;
import java.util.Map;

public class SignFactory {
    private Map<String, SignOperation> signOperationMap = new HashMap<>();

    public SignFactory(){
        signOperationMap.put("SEND", new SendMessage());
    }

    public SignOperation getOp(String sign, String data, IO io){
        signOperationMap.get(sign).setIO(io);
        signOperationMap.get(sign).setData(data);
        return signOperationMap.get(sign);
    }
}
