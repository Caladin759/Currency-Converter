public class Currency {
     private double rate;
     private String country;
     private String isoAlpha;


     public Currency(double rate, String country, String isoAlpha){
          this.rate = rate;
          this.country = country;
          this.isoAlpha = isoAlpha;
     }

     public double getRate(){return this.rate;}
     public String getCountry(){return this.country;}
     public String getIsoAlpha() {
          return isoAlpha;
     }

     public void setRate(double rate) {
          this.rate = rate;
     }
     public void setCountry(String country) {
          this.country = country;
     }
     public void setIsoAlpha(String isoAlpha) {
          this.isoAlpha = isoAlpha;
     }


}


