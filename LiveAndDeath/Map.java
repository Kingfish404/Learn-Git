package LiveAndDeath;

public class Map {
    private static int len = 50;
    private int data[][]; // 缁嗚優鍦板浘淇℃伅锛�0涓烘缁嗚優锛�1涓烘椿缁嗚優

    public Map() {
        init(0.5);
    }

    public Map(Double i) {
        init(i);
    }

    // 鍒濆鍖栧湴鍥炬暟鎹�,model浣滀负姣忎釜灏忔牸瀛愭缁嗚優鐨勬璁猴紝榛樿涓�0.5
    public void init(double model) {
        data = new int[len][len];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = Math.random() > (double) 0.5 ? 1 : 0;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = Math.random() > model ? 1 : 0;
            }
        }
    }

    // 杩斿洖鍦板浘澶у皬
    public int getLen() {
        return len;
    }

    // 淇敼鏌愪釜鐐圭殑鍊�
    public void set(int i, int j, int t) {
        data[i][j] = t;
    }

    // 寰楀埌鏌愪釜鐐圭殑鍊�
    public int get(int i, int j) {
        return data[i][j];
    }

    public int getNeiber(int i, int j) {
        int neiber = 0;
        for (int k = -1; k < 2; k++) {
            for (int k2 = -1; k2 < 2; k2++) {
                if (i + k >= 0 && i + k < len) {
                    if (j + k2 >= 0 && j + k2 < len) {
                        if (k == 0 && k2 == 0) {

                        } else {
                            if (get(i + k, j + k2) != 0) {
                                neiber++;
                            }
                        }
                    }
                }
            }
        }
        return neiber;
    }
}