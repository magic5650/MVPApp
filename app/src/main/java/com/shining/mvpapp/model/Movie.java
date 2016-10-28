package com.shining.mvpapp.model;

import java.util.List;

/**
 * Created by Administrator on 2016-10-25.
 */

public class Movie {
    /**
     * max : 10
     * average : 9.1
     * stars : 45
     * min : 0
     */

    private RatingBean rating;
    /**
     * rating : {"max":10,"average":9.1,"stars":"45","min":0}
     * reviews_count : 3162
     * wish_count : 43969
     * douban_site :
     * year : 2009
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p579729551.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p579729551.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p579729551.jpg"}
     * alt : https://movie.douban.com/subject/3793023/
     * id : 3793023
     * mobile_url : https://movie.douban.com/subject/3793023/mobile
     * title : 三傻大闹宝莱坞
     * do_count : null
     * share_url : https://m.douban.com/movie/subject/3793023
     * seasons_count : null
     * schedule_url :
     * episodes_count : null
     * countries : ["印度"]
     * genres : ["剧情","喜剧","爱情"]
     * collect_count : 735607
     * casts : [{"alt":"https://movie.douban.com/celebrity/1031931/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/13628.jpg","large":"https://img1.doubanio.com/img/celebrity/large/13628.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/13628.jpg"},"name":"阿米尔·汗","id":"1031931"},{"alt":"https://movie.douban.com/celebrity/1049635/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/5568.jpg","large":"https://img1.doubanio.com/img/celebrity/large/5568.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/5568.jpg"},"name":"卡琳娜·卡普尔","id":"1049635"},{"alt":"https://movie.douban.com/celebrity/1018290/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/5651.jpg","large":"https://img3.doubanio.com/img/celebrity/large/5651.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/5651.jpg"},"name":"马达范","id":"1018290"},{"alt":"https://movie.douban.com/celebrity/1032430/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/5650.jpg","large":"https://img3.doubanio.com/img/celebrity/large/5650.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/5650.jpg"},"name":"沙尔曼·乔希","id":"1032430"}]
     * current_season : null
     * original_title : 3 Idiots
     * summary : 本片根据印度畅销书作家奇坦·巴哈特（Chetan Bhagat）的处女作小说《五点人》（Five Point Someone）改编而成。法兰（马德哈万 R Madhavan 饰）、拉杜（沙曼·乔希 Sharman Joshi 饰）与兰乔（阿米尔·汗 Aamir Khan 饰）是皇家工程学院的学生，三人共居一室，结为好友。在以严格著称的学院里，兰乔是个非常与众不同的学生，他不死记硬背，甚至还公然顶撞校长“病毒”（波曼·伊拉尼 Boman Irani 饰），质疑他的教学方法。他不仅鼓动法兰与拉杜去勇敢追寻理想，还劝说校长的二女儿碧雅（卡琳娜·卡普 Kareena Kapoor 饰）离开满眼铜臭的未婚夫。兰乔的特立独行引起了模范学生“消音器”（奥米·维嘉 Omi Vaidya 饰）的不满，他约定十年后再与兰乔一决高下，看哪种生活方式更能取得成功。
     本片获孟买电影博览奖最佳影片、最佳导演、最佳配角（波曼·伊拉尼）、最佳剧本等六项大奖，并获国际印度电影协会最佳影片、最佳导演、最佳剧情、最佳摄影等十六项大奖。©豆瓣
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1286677/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/16549.jpg","large":"https://img1.doubanio.com/img/celebrity/large/16549.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/16549.jpg"},"name":"拉吉库马尔·希拉尼","id":"1286677"}]
     * comments_count : 169676
     * ratings_count : 581033
     * aka : ["三个傻瓜(台)","作死不离3兄弟(港)","三个白痴","三个傻蛋","三个呆瓜","三生万悟","寻找兰彻","Three Idiots"]
     */

    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    /**
     * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p579729551.jpg
     * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p579729551.jpg
     * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p579729551.jpg
     */

    private ImagesBean images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
    private List<String> genres;
    /**
     * alt : https://movie.douban.com/celebrity/1031931/
     * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/13628.jpg","large":"https://img1.doubanio.com/img/celebrity/large/13628.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/13628.jpg"}
     * name : 阿米尔·汗
     * id : 1031931
     */

    private List<CastsBean> casts;
    /**
     * alt : https://movie.douban.com/celebrity/1286677/
     * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/16549.jpg","large":"https://img1.doubanio.com/img/celebrity/large/16549.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/16549.jpg"}
     * name : 拉吉库马尔·希拉尼
     * id : 1286677
     */

    private List<DirectorsBean> directors;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        private String alt;
        /**
         * small : https://img1.doubanio.com/img/celebrity/small/13628.jpg
         * large : https://img1.doubanio.com/img/celebrity/large/13628.jpg
         * medium : https://img1.doubanio.com/img/celebrity/medium/13628.jpg
         */

        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        private String alt;
        /**
         * small : https://img1.doubanio.com/img/celebrity/small/16549.jpg
         * large : https://img1.doubanio.com/img/celebrity/large/16549.jpg
         * medium : https://img1.doubanio.com/img/celebrity/medium/16549.jpg
         */

        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
