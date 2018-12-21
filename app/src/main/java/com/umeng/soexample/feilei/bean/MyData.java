package com.umeng.soexample.feilei.bean;


import java.util.List;

public class MyData {

    private int status;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 143
         * name : 麦套餐Combos
         * restaurant_id : 32
         * created_at : 2018-04-05T05:08:44.537Z
         * spus : [{"_id":"5ac5b0913714cc2d644f461e","id":1089,"restaurant_id":32,"category_id":143,"name":"套餐8：海苔鸡肉卷+辣翅+可乐","praise_num":49,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4624","id":1092,"restaurant_id":32,"category_id":143,"name":"套餐6：墨西哥卷+辣翅+可乐","praise_num":36,"praise_content":"好吃","month_saled":45,"month_saled_content":"45","pic_url":"http://p0.meituan.net/wmproduct/7aaf4cc385728744f92d5b01e4bd109b47253.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"真羡慕那些能工作起来就忘了吃饭的人啊。","price":"16.8","id":1087,"_id":"5ac5b0913714cc2d644f4625"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f461c","id":1088,"restaurant_id":32,"category_id":143,"name":"套餐3：虾堡+鸡米花+可乐","praise_num":40,"praise_content":"好吃","month_saled":15,"month_saled_content":"15","pic_url":"http://p1.meituan.net/wmproduct/f91f4567768cb2bb1635a72b53399b6e57019.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1089,"_id":"5ac5b0913714cc2d644f461d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4620","id":1093,"restaurant_id":32,"category_id":143,"name":"套餐16：蜜汁烤鸡+可乐2罐","praise_num":2,"praise_content":"好吃","month_saled":39,"month_saled_content":"39","pic_url":"http://p1.meituan.net/wmproduct/ba5447b153e90e370fbc5f0824f0d3c5164350.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1095,"_id":"5ac5b0913714cc2d644f4621"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4622","id":1085,"restaurant_id":32,"category_id":143,"name":"套餐12：鸡堡+墨西哥卷+辣翅","praise_num":10,"praise_content":"好吃","month_saled":2,"month_saled_content":"2","pic_url":"http://p0.meituan.net/wmproduct/f1f0af2b8fdf439eec7300c7368fb6a753299.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1092,"_id":"5ac5b0913714cc2d644f4623"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462a","id":1095,"restaurant_id":32,"category_id":143,"name":"套餐17：韩式烤鸡+可乐1罐","praise_num":37,"praise_content":"好吃","month_saled":3,"month_saled_content":"3","pic_url":"http://p0.meituan.net/wmproduct/5110ab1eb638ffab6e1397479aa45926141298.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1094,"_id":"5ac5b0913714cc2d644f462b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4632","id":1097,"restaurant_id":32,"category_id":143,"name":"套餐9：鸡堡+墨西哥卷+可乐","praise_num":25,"praise_content":"好吃","month_saled":30,"month_saled_content":"30","pic_url":"http://p1.meituan.net/wmproduct/143245d705ef1d3e6b92cf4ff5351ea152673.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1098,"_id":"5ac5b0913714cc2d644f4633"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4638","id":1098,"restaurant_id":32,"category_id":143,"name":"套餐14：韩式风味汉堡+辣翅+可乐","praise_num":17,"praise_content":"好吃","month_saled":10,"month_saled_content":"10","pic_url":"http://p1.meituan.net/wmproduct/3332320a48946f475b673cc3e97e86ad51238.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1100,"_id":"5ac5b0913714cc2d644f4639"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4630","id":1091,"restaurant_id":32,"category_id":143,"name":"套餐11：台湾大鸡排+辣翅+可乐","praise_num":23,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p1.meituan.net/wmproduct/ed589ea86f8484905e8ed5275988295956150.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1091,"_id":"5ac5b0913714cc2d644f4631"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4634","id":1102,"restaurant_id":32,"category_id":143,"name":"套餐15：泰式大鸡腿+辣翅+地瓜丸3个+可乐","praise_num":23,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/5e1deee9c87b4bfe6ebe15e9fea6397b62675.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1101,"_id":"5ac5b0913714cc2d644f4635"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4628","id":1090,"restaurant_id":32,"category_id":143,"name":"套餐13：鸡米花+辣翅+鸡块+地瓜丸3个","praise_num":20,"praise_content":"好吃","month_saled":35,"month_saled_content":"35","pic_url":"http://p0.meituan.net/wmproduct/1c872e9d4d7fed4e5a5ed495c2dab1cc53005.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1093,"_id":"5ac5b0913714cc2d644f4629"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462c","id":1087,"restaurant_id":32,"category_id":143,"name":"套餐7：韩式鸡肉卷+川香鸡柳+可乐","praise_num":27,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p0.meituan.net/wmproduct/4598dbc36cadfaed8b9adbddc3d64ef346484.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1088,"_id":"5ac5b0913714cc2d644f462d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462e","id":1094,"restaurant_id":32,"category_id":143,"name":"套餐1：鸡堡+薯条+可乐","praise_num":22,"praise_content":"好吃","month_saled":11,"month_saled_content":"11","pic_url":"http://p0.meituan.net/wmproduct/3bd6d89f28f48697b668dd7e6800a25454926.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1086,"_id":"5ac5b0913714cc2d644f462f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463c","id":1099,"restaurant_id":32,"category_id":143,"name":"套餐4：板烧堡+辣翅+可乐","praise_num":31,"praise_content":"好吃","month_saled":24,"month_saled_content":"24","pic_url":"http://p0.meituan.net/wmproduct/160cf88068d1ca8d2c1bd4cfde6ac91d56015.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1096,"_id":"5ac5b0913714cc2d644f463d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4626","id":1086,"restaurant_id":32,"category_id":143,"name":"套餐2：鸡堡+辣翅+可乐","praise_num":34,"praise_content":"好吃","month_saled":46,"month_saled_content":"46","pic_url":"http://p1.meituan.net/wmproduct/27d720afd3ea2f68d890e8264ac4947f55218.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"吃得是福，多多益善","price":"16.8","id":1085,"_id":"5ac5b0913714cc2d644f4627"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463a","id":1100,"restaurant_id":32,"category_id":143,"name":"套餐5：墨西哥卷+薯条+可乐","praise_num":45,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/e0e0161aa602b1283a26b56e88c6110e46677.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1097,"_id":"5ac5b0913714cc2d644f463b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463e","id":1101,"restaurant_id":32,"category_id":143,"name":"套餐10：鸡堡+虾堡+可乐","praise_num":8,"praise_content":"好吃","month_saled":7,"month_saled_content":"7","pic_url":"http://p0.meituan.net/wmproduct/f017015ef3c6be194c22344b7af6b07757167.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1099,"_id":"5ac5b0913714cc2d644f463f"}],"attrs":[],"status_remind_list":[]}]
         * __v : 17
         */

        private int id;
        private String name;
        private int restaurant_id;
        private String created_at;
        private int __v;
        private List<SpusBean> spus;



        private boolean isChecked;




        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRestaurant_id() {
            return restaurant_id;
        }

        public void setRestaurant_id(int restaurant_id) {
            this.restaurant_id = restaurant_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public List<SpusBean> getSpus() {
            return spus;
        }

        public void setSpus(List<SpusBean> spus) {
            this.spus = spus;
        }

        public static class SpusBean {
            /**
             * _id : 5ac5b0913714cc2d644f461e
             * id : 1089
             * restaurant_id : 32
             * category_id : 143
             * name : 套餐8：海苔鸡肉卷+辣翅+可乐
             * praise_num : 49
             * praise_content : 好吃
             * month_saled : 1
             * month_saled_content : 1
             * pic_url : http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg
             * __v : 0
             * created_at : 2018-04-05T05:08:44.549Z
             * skus : [{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}]
             * attrs : []
             * status_remind_list : []
             */

            private String _id;
            private int id;
            private int restaurant_id;
            private int category_id;
            private String name;
            private int praise_num;
            private String praise_content;
            private int month_saled;
            private String month_saled_content;
            private String pic_url;
            private int __v;
            private String created_at;
            private List<SkusBean> skus;
            private List<?> attrs;
            private List<?> status_remind_list;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getRestaurant_id() {
                return restaurant_id;
            }

            public void setRestaurant_id(int restaurant_id) {
                this.restaurant_id = restaurant_id;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPraise_num() {
                return praise_num;
            }

            public void setPraise_num(int praise_num) {
                this.praise_num = praise_num;
            }

            public String getPraise_content() {
                return praise_content;
            }

            public void setPraise_content(String praise_content) {
                this.praise_content = praise_content;
            }

            public int getMonth_saled() {
                return month_saled;
            }

            public void setMonth_saled(int month_saled) {
                this.month_saled = month_saled;
            }

            public String getMonth_saled_content() {
                return month_saled_content;
            }

            public void setMonth_saled_content(String month_saled_content) {
                this.month_saled_content = month_saled_content;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public List<SkusBean> getSkus() {
                return skus;
            }

            public void setSkus(List<SkusBean> skus) {
                this.skus = skus;
            }

            public List<?> getAttrs() {
                return attrs;
            }

            public void setAttrs(List<?> attrs) {
                this.attrs = attrs;
            }

            public List<?> getStatus_remind_list() {
                return status_remind_list;
            }

            public void setStatus_remind_list(List<?> status_remind_list) {
                this.status_remind_list = status_remind_list;
            }

            public static class SkusBean {
                /**
                 * description :
                 * price : 20.8
                 * id : 1090
                 * _id : 5ac5b0913714cc2d644f461f
                 */

                private String description;
                private String price;
                private int id;
                private String _id;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }
            }
        }
    }
}
