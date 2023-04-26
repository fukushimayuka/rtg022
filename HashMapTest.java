import java.util.Map;
import java.util.HashMap;

class HashMapTest {
    public static void main(String[] args) {

        //Map型の宣言と初期化
        Map<String, String> map = new HashMap<>();

        //要素の追加
        map.put("A501", "satomi");
        map.put("A502", "tanaka");
        map.put("C930", "hagiwara");

        //指定のキーに対する値を取得
        System.out.println("A501=" + map.get("A501"));

        //マップサイズを取得
        System.out.println("マップサイズ=" + map.size());

        //キーの存在確認
        String wantedKey = "C930";
        if(map.containsKey(wantedKey)) {
            System.out.println(wantedKey + "=" + map.get(wantedKey));
        } else {
            System.out.println(wantedKey + "というキーは存在しません");
        }

        //重複キーの登録はできない。値が書き換わる。
        map.put("A501", "James");
        System.out.println("A501=" + map.get("A501"));

        //キーの一覧を取得、順番は保証されない
        //Set<String> keys = map.keySet();
        var keys = map.keySet();
        System.out.println("---------キーの一覧---------");
        for(var val: keys) {
            System.out.println(val);
        }
        System.out.println(keys);

        //値の一覧を取得
        //Collection<String> values = map.values();
        var values = map.values();

        for(var val: values) {
            System.out.println(val);
        }

        //キー/バリューの全一覧を取得
        //Set<Map.Entry<String, String>> entries = map.entrySet();
        var entries = map.entrySet();
        System.out.println("---------キー/バリューの一覧---------");
        for(var val: entries) {
            System.out.println(val.getKey() + "=" + val.getValue());
        }
        
        
    }
}