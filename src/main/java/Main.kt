import utils.RequestHandler
import utils.URLDecoder

fun main() {
  // Program starts here

    print(RequestHandler().getData("jsonplaceholder.typicode.com/posts/1"))

    /*
    * public enum IviHttpParams {
    FIELDS("fields", new StringHandler()),
    CATEGORY("category", new PrimitivesHandlerImpl()),
    PAID_TYPE("paid_type", new ArrayEnumHandler()),
    EXCLUDE_PAID_TYPE("exclude_paid_type", new ArrayEnumHandler()),
    GENDER("gender", new PrimitivesHandlerImpl()),
    LOCALIZATION_ID("localization", new PrimitivesHandlerImpl()),
    SORT("sort", new StringHandler()),
    COUNTRY("country", new PrimitivesHandlerImpl()),
    GENRE("genre", new PrimitivesHandlerImpl()),
    YEAR_FROM("year_from", new PrimitivesHandlerImpl()),
    YEAR_TO("year_to", new PrimitivesHandlerImpl()),
    ALLOW_DOWNLOAD("allow_download", new PrimitivesHandlerImpl()),
    EXTEND_LOCALIZATION("has_localization", new PrimitivesHandlerImpl()),
    ALLOW_SUBTITLES("has_subtitles", new PrimitivesHandlerImpl()),
    SHOW_FILTER("show_filters", new PrimitivesHandlerImpl());
*/
    /* Device type
    * CHILDREN_PHONE(17601, 3447, "98ea2cb2a7cc595cb7a7e6a985a677fd", "d4e0fb78393ab265", "a9c1f6f0727564d1"),
    CHILDREN_TABLET(17619, 3448, "6371db80449089ad2172e708da6d27a0", "86472311fdfc3f9e", "0c8e4623fbf87f27"),
    COMIGO(4856, 1504, "bde9e570140e26daee8b4cdce3d5bb85", "e75d776a96bc563c", "cebaeed52d78ac63"),
    ICONBIT(13100, 2714, "f868f732b7dbe64c38a3258d2a3030de", "23e9550fbf3b8383", "47d2aa1f7e770706"),
    SELENGA(18533, 1027, "1c15cb4d2b56437a87350ee469ded0e6", "18f47deefdc5e933", "31e8fbddfb8bd266"),
    INVIN(18533, 1027, "1c15cb4d2b56437a87350ee469ded0e6", "18f47deefdc5e933", "31e8fbddfb8bd266"),
    DIVISAT(18533, 1027, "1c15cb4d2b56437a87350ee469ded0e6", "18f47deefdc5e933", "31e8fbddfb8bd266"),
    VMEDIA(14512, 3312, "1c15cb4d2b56437a87350ee469ded0e6", "18f47deefdc5e933", "31e8fbddfb8bd266"),
    MOBILE_PHONE(19782, 141, "0b03fa19dda92a503413adfaf959b54f", "650d7ed83b19bf83", "ca1afdb076337f06"),
    MOBILE_TABLET(19854, 142, "76b7a142af10a1aa0ace9a541a8825f8", "a6f57af6158bed05", "4deaf5ec2b17da11"),
    TV(18533, 1027, "1c15cb4d2b56437a87350ee469ded0e6", "18f47deefdc5e933", "31e8fbddfb8bd266");
    * 870 - браузер
*/
}