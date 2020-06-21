package seven.demo05;

public class MovieStoreTester {
    public static void main(String args[]) {
        MovieStore aStore = new MovieStore();
        Movie aMovie = new Movie("白毛女", "悲剧片");
        aMovie.addActor("田华");
        aMovie.addActor("李百万");
        aMovie.addActor("陈强");
        aStore.addMovie(aMovie);
        aMovie = new Movie("党的女儿", "教育片");
        aMovie.addActor("田华");
        aMovie.addActor("陈戈");
        aStore.addMovie(aMovie);
        aMovie = new Movie("红色娘子军", "教育片");
        aMovie.addActor("祝希娟");
        aMovie.addActor("王心刚");
        aMovie.addActor("陈强");
        aStore.addMovie(aMovie);

        aMovie = new Movie("五朵金花", "爱情片");
        aMovie.addActor("陈丽坤");
        aMovie.addActor("赵丹");
        aStore.addMovie(aMovie);

        aMovie = new Movie("上甘岭", "战斗片");
        aMovie.addActor("陈强");
        aMovie.addActor("高保成");
        aStore.addMovie(aMovie);
        aMovie = new Movie("马路天使", "喜剧片");
        aMovie.addActor("赵丹");
        aMovie.addActor("周璇");
        aStore.addMovie(aMovie);
        aMovie = new Movie("少林寺", "武打片");
        aMovie.addActor("葛优");
        aStore.addMovie(aMovie);
        aMovie = new Movie("我的父亲母亲", "爱情片");
        aMovie.addActor("章子怡");
        aMovie.addActor("孙红雷");
        aStore.addMovie(aMovie);
        aMovie = new Movie("红高粮", "艺术片");
        aMovie.addActor("巩俐");
        aMovie.addActor("葁文");
        aStore.addMovie(aMovie);
        System.out.println("Here are the movies in: " + aStore);
        aStore.listMovies();
        System.out.println();
        System.out.println("删除白毛女");
        aStore.removeMovie("白毛女");
        System.out.println("删除秋菊打官司");
        aStore.removeMovie("秋菊打官司");
        System.out.println("\n教育片：");
        aStore.listMoviesOfType("教育片");
        System.out.println("\n爱情片：");
        aStore.listMoviesOfType("爱情片");
        System.out.println("\n陈强的电影::");
        aStore.listMoviesWithActor("陈强");
        System.out.println("\n赵丹的电影:");
        aStore.listMoviesWithActor("赵丹");
    }

}
