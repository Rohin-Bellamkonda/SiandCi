package com.interest.SiandCi;

class Building
{
    double area;
    int type;
    Building(double a,int t){
        this.area=a;
        this.type=t;
    }
    String getCostOfBuilding()
    {
        if(type==1){
            return "Rupees "+String.format("%.2f", area*1200);
        }
        else if(type==2){
            return "Rupees "+String.format("%.2f", area*1500);
        }
        else if(type==3){
            return "Rupees "+String.format("%.2f",area*1800);
        }
        else{
            return "Rupees "+String.format("%.2f",area*2500);
        }
    }
}
