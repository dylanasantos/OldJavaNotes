public final class recursions { //Final does not allow for subclasses

    public int recursionAdd(int x){
        if(x >= 15){
            return x;
        }
        return x = recursionAdd(x+5);
    }

    public int recursionSubtract(int x){
        if(x <= 15){
            return x;
        }
        return x = recursionSubtract(x-5);
    }

    public int recursionMultiply(int x){
        if(x >= 15){
            return x;
        }
        return x = recursionMultiply(x * x - 1);
    }
    
    public int recursionMix(int x){
        if(x >= 15){
            return x;
        }
        return x = recursionMix(x+1) + recursionMix(x*2);
    }

    public String recursionToString(int x){
        return " " + x;
    }
}
