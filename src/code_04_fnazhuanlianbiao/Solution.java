package code_04_fnazhuanlianbiao;

import java.util.ArrayList;

/*
*
* 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
* 解法：递归实现，先递归查找下一个，再存本节点值到ArrayList
* 也可以使用栈来实现
*
* */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    ArrayList<Integer> arrayList = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){

        }else{
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}


