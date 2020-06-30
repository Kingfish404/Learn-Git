package LiveAndDeath;
public class Logic {

    // 更新map数据
    public void update(Map map){
        for (int i = 0; i < map.getLen(); i++) {
            for (int j = 0; j < map.getLen(); j++) {
                int neiber=0;
                neiber = map.getNeiber(i, j);
                if(neiber==2){

                }else if(neiber==3){
                    map.set(i,j,1);
                }else{
                    map.set(i,j,0);
                }
            }
        }
    }
}