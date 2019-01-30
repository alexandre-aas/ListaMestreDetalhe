package com.s.d.a.a.listamestredetalhe.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
        // Add some sample items.
        //for (int i = 1; i <= COUNT; i++) {
           //addItem(createDummyItem(i));
        //}
        //Será acrescentado apenas 3 sites
        addItem(new DummyItem("1", "Unochapecó", "https://www.unochapeco.edu.br/"));
        addItem(new DummyItem("2", "IFSC", "http://www.ifsc.edu.br//"));
        addItem(new DummyItem("3", "Udesc", "https://www.udesc.br/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }*/

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String nome_website;
        public final String url_website;

        public DummyItem(String id, String nome_website, String url_website) {
            this.id = id;
            this.nome_website = nome_website;
            this.url_website = url_website;
        }

        @Override
        public String toString() {
            return nome_website;
        }
    }
}
