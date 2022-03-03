package zheng.sijay;

import com.alibaba.fastjson.JSON;
import zheng.sijay.sort.*;

import java.util.Random;

/**
 * @author 郑世杰
 */
public class Test {
    public static void main(String[] args) {


    }

    public static void mainss(String[] args) {
        int[] arr = new Random().ints(10)
                                .toArray();
        System.out.println(JSON.toJSONString(arr));
        //冒泡排序
        System.out.println(JSON.toJSONString(new BubbleSort().sort(arr)));
        //选择排序
        System.out.println(JSON.toJSONString(new SelectionSort().sort(arr)));
        //插入排序
        System.out.println(JSON.toJSONString(new InsertionSort().sort(arr)));
        //希尔排序
        System.out.println(JSON.toJSONString(new HillSort().sort(arr)));
        //归并排序
        System.out.println(JSON.toJSONString(new MergeSort().sort(arr)));
        //快速排序
        System.out.println(JSON.toJSONString(new QuickSort().sort(arr)));
        //堆排序
        System.out.println(JSON.toJSONString(new HeapSort().sort(arr)));
        //计数排序
        System.out.println(JSON.toJSONString(new CountSort().sort(arr)));
        //桶排序
        System.out.println(JSON.toJSONString(new BucketSort().sort(arr)));
        //基数排序
        System.out.println(JSON.toJSONString(new RadixSort().sort(arr)));
    }

}