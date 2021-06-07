class NameEncoderDecoder {
  public String encode(String name) {
    return "NOTFORYOU" + name.strip().replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5") + "YESNOTFORYOU";
  }
  public String decode(String name) {
    return name.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a").replace("NOTFORYOU", "").replace("YES", "");
  }
  
  public static void main(String[] args) {
    NameEncoderDecoder names = new NameEncoderDecoder();
    String encodeName = names.encode("Crab");
    String decodeName = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
    System.out.println(encodeName);
    System.out.println(decodeName);
    
  }
}