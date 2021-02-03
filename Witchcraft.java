public class Witchcraft{
    
    int Yoda;
    int Aoda;
    int Yodb;
    int Aodb;

     float avgKill() {
        float r;
        int ra;
        int rb;

        if((this.Yoda<0) || (this.Aoda<0) || (this.Yodb<0) || (this.Aodb < 0)) {
            return -1;
        } else {
            ra = KillSpell(this.Yoda - this.Aoda);
            rb = KillSpell(this.Yodb - this.Aodb);
            r = (float)(ra+rb) / 2;

		return r;
	    }
    }


    private static int KillSpell(int year) {
        Integer[] bowl ={};
	    int onion;

        for(int i = 0; i < year; i++) {
            if(i == 0) {
                bowl = append(bowl, 1);
            } else {
                onion = bowl[i-1] + Mantra(i);
                bowl = append(bowl, onion);
            }

        }
        return bowl[bowl.length-1];
    }

    private static int Mantra(int y){
        Integer[] x = {};
        int r;

        for( int i = 0; i <= y; i++) {
    
            if( i > 2 ) {
                r = x[i-1] + x[i-2];
                x = append(x, r);
            } else {
    
                x = append(x, i);
            }
    
        }
        return x[x.length-1];

    }

    private static Integer[] append(Integer[] arr, int element) {
        Integer[] array = new Integer[arr.length + 1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = element;
        return array;
    }



}