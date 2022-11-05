
public class LargeSampleStats {
    public int[] input;
    public double[] output;

    public static void main(String[] args) {
        int[] demoIn = {264,912,1416,1903,2515,3080,3598,4099,4757,5270,5748,6451,7074,7367,7847,8653,9318,9601,10481,10787,11563,11869,12278,12939,13737,13909,14621,15264,15833,16562,17135,17491,17982,18731,19127,19579,20524,20941,21347,21800,22342,21567,21063,20683,20204,19818,19351,18971,18496,17974,17677,17034,16701,16223,15671,15167,14718,14552,14061,13448,13199,12539,12265,11912,10931,10947,10516,10177,9582,9102,8699,8091,7864,7330,6915,6492,6013,5513,5140,4701,4111,3725,3321,2947,2357,1988,1535,1124,664,206,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        test(demoIn);
        
        int[] demoIn2 = {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        test(demoIn2);

        int[] demoIn3 = {2725123,2529890,2612115,3807943,3002363,3107290,2767526,981092,896521,2576757,2808163,3315813,2004022,2516900,607052,1203189,2907162,1849193,1486120,743035,3621726,3366475,639843,3836904,462733,2614577,1881392,85099,709390,3534613,360309,404975,715871,2258745,1682843,3725079,564127,1893839,2793387,2236577,522108,1183512,859756,3431566,907265,1272267,2261055,2234764,1901434,3023329,863353,2140290,2221702,623198,955635,304443,282157,3133971,1985993,1113476,2092502,2896781,1245030,2681380,2286852,3423914,3549428,2720176,2832468,3608887,174642,1437770,1545228,650920,2357584,3037465,3674038,2450617,578392,622803,3206006,3685232,2687252,1001246,3865843,2755767,184888,2543886,2567950,1755006,249516,3241670,1422728,809805,955992,415481,26094,2757283,995334,3713918,2772540,2719728,1204666,1590541,2962447,779517,1322374,1675147,3146304,2412486,902468,259007,3161334,1735554,2623893,1863961,520352,167827,3654335,3492218,1449347,1460253,983079,1135,208617,969433,2669769,284741,1002734,3694338,2567646,3042965,3186843,906766,2755956,2075889,1241484,3790012,2037406,2776032,1123633,2537866,3028339,3375304,1621954,2299012,1518828,1380554,2083623,3521053,1291275,180303,1344232,2122185,2519290,832389,1711223,2828198,2747583,789884,2116590,2294299,1038729,1996529,600580,184130,3044375,261274,3041086,3473202,2318793,2967147,2506188,127448,290011,3868450,1659949,3662189,1720152,25266,1126602,1015878,2635566,619797,2898869,3470795,2226675,2348104,2914940,1907109,604482,2574752,1841777,880254,616721,3786049,2278898,3797514,1328854,1881493,1802018,3034791,3615171,400080,2277949,221689,1021253,544372,3101480,1155691,3730276,1827138,3621214,2348383,2305429,313820,36481,2581470,2794393,902504,2589859,740480,2387513,2716342,1914543,3219912,1865333,2388350,3525289,3758988,961406,1539328,448809,1326527,1339048,2924378,2715811,376047,3642811,2973602,389167,1026011,3633833,2848596,3353421,1426817,219995,1503946,2311246,2618861,1497325,3758762,2115273,3238053,2419849,2545790};
        test(demoIn3);

        int[] demoIn4 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        test(demoIn4);

        int[] demoIn5 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3510,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6718,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27870,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,26256,0,0,0,0,9586565,0,0,0,0,0,0,0,2333,0,0,0,0};
        test(demoIn5);
    }
    private static void test(int[] demoIn) {
        LargeSampleStats demo = new LargeSampleStats(demoIn);

        System.out.println(demo.output[0]);
        System.out.println(demo.output[1]);
        System.out.println(demo.output[2]);
        System.out.println(demo.output[3]);
        System.out.println(demo.output[4]+"\n");
    }
    public LargeSampleStats(int[] in){
        this.input = in;
        this.output = sampleStats(this.input);
    }
    public double[] sampleStats(int[] count) {
        double[] out = {-1,-1,-1,-1,-1};
        int largestCount = 0;
        int sampleSize = 0;
        long sum = 0;
        for(int i = 0; i < count.length; ++i){
            sum = (long)i*count[i] + sum;
            if(count[i]>0){
                if(out[0]==-1){
                    out[0] = i;
                }
                if(out[1] < i){
                    out[1] = i;
                }
                if(count[i] > largestCount){
                    largestCount = count[i];
                    out[4] = i;
                }
            }
            sampleSize = sampleSize + count[i];
        }
        out[2] = (double)sum/sampleSize;

        if(sampleSize % 2 == 1){
            int target = (sampleSize + 1)/2;
            int pointedAt = 0;
            for(int i = 0; i < count.length; ++i){
                pointedAt = pointedAt + count[i];
                if(pointedAt >= target){
                    out[3] = i;
                    i = count.length + 1;
                }
            }
        } else{
            int targetMax = (sampleSize /2)+1;
            int pointedAt = 0;
            int lastPoint = pointedAt;
            int lastNonZero = 0;
            for(int i = 0; i < count.length; ++i){
                lastPoint = pointedAt;
                pointedAt = pointedAt + count[i];
                
                if(pointedAt >= targetMax) {
                    if(pointedAt > targetMax - 1 && lastPoint != targetMax - 1){
                        out[3] = i;
                    } else{
                        out[3] = (double)(i + lastNonZero)/2;
                    }
                }
                if(count[i] > 0){
                    lastNonZero = i;
                }
                if(out[3] != -1){
                    i = count.length;
                }
            }
            
        }
        
        return out;
    }
}