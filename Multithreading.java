class FileDownload {
    String fileName;

    public FileDownload(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(fileName + " " + "downloading" + (i * 20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        System.out.println(fileName + "done");
    }
}
   class Multithrading{
    public static void main(String[] args) {
        FileDownload t1=new FileDownload("file A");
        FileDownload t2=new FileDownload("file B");
        t1.run();
        t2.run();
    }
}


