package code_04_fnazhuanlianbiao;

import java.util.ArrayList;
import java.util.Stack;

/*
*
* 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
* 解法：递归实现，先递归查找下一个，再存本节点值到ArrayList
* 也可以使用栈来实现
*
* */
public class Solution2 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}


