package test;

import java.util.LinkedHashMap;
import java.util.Map;


public class LruCachemap<K, V> extends LinkedHashMap<K, V> {
    /** シリアライズバージョン */
    private static final long serialVersionUID = 1L;

    /** キャッシュエントリ最大数 */
    private final int maxSize;

    
    public LruCachemap(int maxSize) {
        super(15, 0.75f, true);
        this.maxSize = maxSize;
    }

   
    /** エントリの削除要否を判断 */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

   
}
