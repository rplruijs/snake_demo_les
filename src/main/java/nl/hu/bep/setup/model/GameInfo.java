package nl.hu.bep.setup.model;

public class GameInfo {

        private String apiversion = "1";
        private String author = "remco";
        private String color =  "#cc0000";
        private String head = "default";
        private String tail = "default";
        private String version = "0.0.1-beta";


        public String getApiversion() {
                return apiversion;
        }

        public String getAuthor() {
                return author;
        }

        public String getColor() {
                return color;
        }

        public String getHead() {
                return head;
        }

        public String getTail() {
                return tail;
        }

        public String getVersion() {
                return version;
        }

        public void setColor(String color) {
                this.color = color;
        }
}
