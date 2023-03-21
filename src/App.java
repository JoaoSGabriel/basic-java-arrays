public class App {
    public static void main(String[] args) {
        App p = new App();

        String[] fruits1 = new String[]{"Uva", "Banana", "Manga", "Cajá", "Pinha"};
        String[] fruits2 = new String[]{"Morango", "Laranja", "Maça", "Manga", "Abacaxi"};

        p.findDuplicate(fruits1, fruits2);
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }

    void findDuplicate(String[] str1, String[] str2) {
        for(int i = 0; i < str1.length; i++) {
            for(int z = 0; z < str2.length; z++) {
                if(str1[i].equals(str2[z])) {
                    System.out.println(str1[i]);
                }
            }
        }
    }
}
