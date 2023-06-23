package com.utp.testinnp.api.params;

public class HttpParams {
    //Base url
    public static final String BASE_URL = "https://noticiaspiura30.pe/wp-json/wp/v2/";

    //Post
    public static final String POST_ID = "posts/{id}";
    public static final String POST_ALL = "posts/?filter[category_name]=country&per_page=99";

    //Media
    public static final String MEDIA_FEATURED = "media/{featured_media}";

}
