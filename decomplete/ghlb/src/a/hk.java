/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  org.json.JSONObject
 */
package a;

import android.content.Context;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import org.json.JSONObject;

public class hk {
    public static int isValid = 0;
    public static String key = "pl";
    private Context mContext;

    public hk(Context context) {
        this.mContext = context;
    }

    public static void cks() {
        String string;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)new StrictMode.ThreadPolicy.Builder().permitAll().build());
        isValid = 0;
        Object object = (HttpURLConnection)new URL("https://firebasestorage.googleapis.com/v0/b/hmod-26884.appspot.com/o/Cks%2Fcks.json?alt=media&token=52451eba-7488-43bc-a407-64d9f1814c47").openConnection();
        ((HttpURLConnection)object).setRequestMethod("GET");
        ((URLConnection)object).setConnectTimeout(10000);
        ((URLConnection)object).setReadTimeout(10000);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
        CharSequence charSequence = new StringBuilder();
        while ((string = bufferedReader.readLine()) != null) {
            charSequence.append(string);
        }
        charSequence = charSequence.toString();
        bufferedReader.close();
        ((HttpURLConnection)object).disconnect();
        bufferedReader = new JSONObject((String)charSequence).getJSONArray("keys");
        object = new HashSet();
        for (int i2 = 0; i2 < bufferedReader.length(); ++i2) {
            ((HashSet)object).add(bufferedReader.getString(i2));
        }
        if (((HashSet)object).contains(key)) {
            isValid = 1;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
    }
}

