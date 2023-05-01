main(String[] args) {
    final int n = 1000000;
   ArrayList<Integer> a = new ArrayList<>(n);
   for (int i = 0; i < n; i++)
     a.add(i);
   for (int i = 0; i < n; i++)
     a.set(i, a.get(i) + 1);

    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader("file.txt"));
        String line;

        while ((line = br.getLine()) != null) {

        }


    } catch (Exception e) { // catch all errors
       e.printStackTrace(); // print out a stack dump if anything happens        
    } finally {
        if (br != null)
            br.close();
    }
}