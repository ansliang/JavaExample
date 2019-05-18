public class BreakCye {
    public static void main(String[] args) {
        System.out.println("---------------中断单层循环的例子---------------");
        String[] array = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰纹鸟"};
        System.out.println("在你发现第一只老鹰前，告诉我都有什么鸟。");

        for (String s : array) {
            if (s.equals("老鹰"))
                break;
            System.out.print(s + "\t");
        }
        System.out.println("\n---------------中断双层循环的例子---------------");

        int[][] mySorces = new int[][]{{67, 78, 63, 82, 66}, {65, 68, 78, 45, 94}, {95, 97, 92, 93, 81}};
        System.out.println("这次的成绩：\n数学\t语文\t英语\t美术\t历史");
        No1:
        for (int[] is : mySorces) {
            for (int i : is) {
                System.out.print(i + "\t\t");
                if (i < 60) {
                    System.out.println("\n等等，" + i + "分的这个是什么？这个为什么不及格？");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
