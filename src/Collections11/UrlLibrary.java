package Collections11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
    LinkedList<String> urls = new LinkedList<>();

    private class UrlIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public Object next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line;

                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }

                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    public UrlLibrary() {

        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.facebook.com/caveofprogramming");
        //urls.add("http://www.news.bbc.co.uk");
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

//    @Override
//    public Iterator<String> iterator() {
//        return urls.iterator();
//    }
}
