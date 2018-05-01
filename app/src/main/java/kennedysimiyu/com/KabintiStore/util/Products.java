package kennedysimiyu.com.KabintiStore.util;

import java.math.BigDecimal;
import java.util.HashMap;

import kennedysimiyu.com.KabintiStore.R;
import kennedysimiyu.com.KabintiStore.models.Product;


/**
 *
 */

public class Products {
    // array for all our products in the app
    public Product[] PRODUCTS = {BLUE_DRESS, PURPLE_SPORTS_SHOE, LADIES_TOP, LADIES_BAG_RED , HEELS_BLACK, LADIES_HAT, LADIES_HEEL_G, WOMEN_DRESS_FLRS, WEDDING_SHOE,
    LADIES_SMALL_BAG, LADIES_HEEL_STRP, WOMEN_RED_DRESS, YELLOW_HEELS, RED_SPORTS_SHOE, WOMEN_BAG_CASUAL, LADIES_ORANGE_DRESS, GOLDEN_LADIES_DRESS,
            LADIES_HAND_BAG_RED, LILAC_LADIES_DRESS, LADIES_HEELS_LIGHT, COSY_RED_HEELS, LADIES_HEELS_ORANGE_LIGHT, GREEN_LADIES_HANDBAG, BROWN_LADIES_BAG_STRP,
            LADIES_TOP_STRP, LADIES_DRESS_STRP, LADIES_BAG_MODERN };

    // Hashmap allowing as to easily retrieve our products objects with serial numbers
    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public Products() {
        for(Product product : PRODUCTS){
            PRODUCT_MAP.put(String.valueOf(product.getSerial_number()), product);
        }

    }

    public static final Product BLUE_DRESS = new Product("Blue Dress", "Blue colored dress, perfect for dinner dates  " +
            "and matching with blue handbags.", R.drawable.dress_blue, new BigDecimal(10.99), new BigDecimal(9.50), 161,
            new BigDecimal(4.5), 1515611);

    public static final Product PURPLE_SPORTS_SHOE = new Product("Purple Sports Shoe", "Yellow colored sports shoe, perfect for gym  " +
            "and indoor sports.", R.drawable.sports_prpl, new BigDecimal(11.99), new BigDecimal(0), 6,
            new BigDecimal(5), 7725277);

    public static final Product LADIES_TOP = new Product("Maroon Ladies Top", "Maroon ladies top. perfect casual fit.",
            R.drawable.ladies_top, new BigDecimal(5.99), new BigDecimal(0), 66, new BigDecimal(3.5), 2141515);

    public static final Product LADIES_BAG_RED = new Product("Red Ladies Bag", "Modern design ladies bag perfect for outs",
            R.drawable.ladies_bagr, new BigDecimal(6.99), new BigDecimal(0), 7, new BigDecimal(4), 9704833);

    public static final Product HEELS_BLACK = new Product("Black Ladies Heels", "Slick design black ladies heels",
            R.drawable.heels_black, new BigDecimal(8.99), new BigDecimal(0), 157, new BigDecimal(4.5), 9377376);

    public static final Product LADIES_HAT = new Product("Ladies Hat", "Ladies hat with design cuttings " +
            "black robe.",
            R.drawable.ladies_hat, new BigDecimal(20.99), new BigDecimal(0), 121, new BigDecimal(3.5), 6626622);

    public static final Product LADIES_HEEL_G = new Product("Golden Satin Ladies Heel", "A satin golden ladies shoes perfect for official dinner dates " +
            "casual outs.",
            R.drawable.heels_gsatin, new BigDecimal(22.99), new BigDecimal(0), 67, new BigDecimal(4.5), 7837367);

    public static final Product WOMEN_DRESS_FLRS = new Product("Flowers Ladies Dress", "A ladies dress design with flowers " +
            "and flips.",
            R.drawable.dress_flowers, new BigDecimal(18.99), new BigDecimal(15.99), 88, new BigDecimal(2.5), 7695085);

    public static final Product WEDDING_SHOE = new Product("Women Wedding Shoes", "A blue open ladies shoes " +
            "perfect for weddings.",
            R.drawable.women_wedb, new BigDecimal(23.99), new BigDecimal(0), 23, new BigDecimal(4), 9084728);

    public static final Product LADIES_SMALL_BAG = new Product("Small Red Ladies Bag", "A small ladies red bag " +
            "good for carrying accessories.", R.drawable.ladies_bagm, new BigDecimal(25.99), new BigDecimal(0), 98, new BigDecimal(5)
            , 7265405);

    public static final Product LADIES_HEEL_STRP = new Product("Golden Ladies Heel", "Golden and stripped ladies heel " +
            "blends with both long and short dresses.", R.drawable.heel_strpd, new BigDecimal(26.99), new BigDecimal(0), 11, new BigDecimal(3)
            , 9575721);

    public static final Product WOMEN_RED_DRESS = new Product("Red Women Dress", "A red women dress  " +
            "black belt.", R.drawable.women_dressrc, new BigDecimal(25.99), new BigDecimal(0), 51, new BigDecimal(4.5)
            , 5776336);

    public static final Product YELLOW_HEELS = new Product("Yellow Ladies Heels", "Yellow ladies heels  " +
            "perfect match with a blue,red or green dress.", R.drawable.heels_yellow, new BigDecimal(26.99), new BigDecimal(0), 616, new BigDecimal(5)
            , 1408483);

    public static final Product RED_SPORTS_SHOE = new Product("Red Sports Shoe", "Red Sports. High quality" +
            " perfect for outdoor activities, morning and evening runs.", R.drawable.sports_red, new BigDecimal(100), new BigDecimal(59.99)
            , 37, new BigDecimal(4.5), 8830303);

    public static final Product WOMEN_BAG_CASUAL = new Product("Red Casual Women Bag", "A red and strong women casual bag" +
            " suitable for carry heavy things.", R.drawable.women_bag, new BigDecimal(100), new BigDecimal(0)
            , 3, new BigDecimal(4), 9082727);

    public static final Product LADIES_ORANGE_DRESS = new Product("Ladies Orange Dresss", "An orange ladies dress" +
            "perfect for casual outs.", R.drawable.dress_orange, new BigDecimal(189.50), new BigDecimal(100), 43,
            new BigDecimal(4.8), 6638393);

    public static final Product GOLDEN_LADIES_DRESS = new Product("Golden Ladies Dress", "Linen golden ladies dress" +
            " a perfect design for official dates.", R.drawable.dress_golden, new BigDecimal(356), new BigDecimal(315), 22,
            new BigDecimal(3.2), 8093475);

    public static final Product LILAC_LADIES_DRESS = new Product("Lilac Ladies Full Dress", "A casual ladies full dress " +
            "ideal for casual daily wears.", R.drawable.dress_lilac, new BigDecimal(99), new BigDecimal(50), 79,
            new BigDecimal(4.1), 1485032);

    public static final Product LADIES_HAND_BAG_RED = new Product("Red Ladies Hand Bag", "Red sizeable leather ladies handbag " +
            "ideal for travelling.", R.drawable.handbag_m, new BigDecimal(76), new BigDecimal(0), 81,
            new BigDecimal(4.9), 8041414);

    public static final Product LADIES_HEELS_LIGHT = new Product("Light Golden Ladies Heels", "Light ladies golden heels " +
            "makes you comfortable as they are light.", R.drawable.heel_glight, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product COSY_RED_HEELS = new Product("Cosy Red Ladies Heels", "Cosy ladies orange heels with a single thick strap " +
            "makes you comfortable as they are light.", R.drawable.heels_open, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product LADIES_HEELS_ORANGE_LIGHT = new Product("Light Orange Ladies Heels", "Light ladies orange heels with double straps " +
            "makes you comfortable as they are light.", R.drawable.heel_sev, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product GREEN_LADIES_HANDBAG = new Product("Green Ladies Bag", "Light, Sleek and Secure " +
            "perfect for carrying your accessories.", R.drawable.ladies_bag, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product BROWN_LADIES_BAG_STRP = new Product("Brown Ladies Bag", "Brown ladies bag with straps " +
            " blends well with casual wears.", R.drawable.ladies_bagstrp, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product LADIES_TOP_STRP = new Product("Stripped Ladies Top", "White and red stripped ladies top " +
            " blends well with casual wears.", R.drawable.top_strpd, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product LADIES_DRESS_STRP = new Product("Stripped Ladies Dress", "White and blue stripped ladies dress " +
            " blends well with casual shoes.", R.drawable.ladies_sdrs, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);

    public static final Product LADIES_BAG_MODERN = new Product("Ladies Bag Modern", "Modern designed ladies bag " +
            " blends well with casual shoes.", R.drawable.ladies_mbag, new BigDecimal(120), new BigDecimal(0), 37,
            new BigDecimal(3.3), 1145614);
}
















