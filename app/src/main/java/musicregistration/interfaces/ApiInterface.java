package musicregistration.interfaces;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;
import musicregistration.models.RegistrationData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Anshul on 23-11-17.
 */

public interface ApiInterface
{
    String BASE_URL = "http:// 192.168.16.221:3000/";//192.168.16.218

    @Headers("Content-Type: application/json")
    @POST("register")
    Call<JsonObject> senddetails(@Body RegistrationData registrationdata);

    @POST("login")
    @Headers("Content-Type: application/json")
    Call<JsonObject> getdetails(@Body RegistrationData registrationdata);

}
