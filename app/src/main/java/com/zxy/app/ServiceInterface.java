package com.zxy.app;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ServiceInterface {
   public static String BASE_URL = "https://www.baidu.com";
    public static String token = "";

    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Header("RANGE") String downParam, @Url String fileUrl);

    @GET
    Call<ResponseBody> getBaidu(@Url String fileUrl);
}
