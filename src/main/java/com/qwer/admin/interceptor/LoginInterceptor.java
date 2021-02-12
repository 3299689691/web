package com.qwer.admin.interceptor;

import com.baomidou.mybatisplus.core.conditions.interfaces.Compare;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 登录检查
 * 1、配置好拦截器要拦截哪些请求
 * 2、把这些配置放在容器中
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 目标方法执行之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        log.info("preHandle拦截的请求路径是{}",requestURI);

        //登录检查逻辑
        HttpSession session = request.getSession();

        Object loginUser = session.getAttribute("loginUser");

        if(loginUser != null){
            //放行
            return true;
        }

        //拦截住。未登录。跳转到登录页
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    /**
     * 目标方法执行完成以后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle执行{}",modelAndView);
    }

    /**
     * 页面渲染以后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion执行异常{}",ex);
    }

//    public static void main(String[] args) {
//        Solution a=new Solution();
//    }
}
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//   class TreeNode {
//      public int val;
//      public TreeNode left, right;
//      public TreeNode(int val) {
//          this.val = val;
//          this.left = this.right = null;
//      }
//  }
//class Poin{
//    int x;
//    char y;
//    Poin(int x,char y){
//        this.x=x;
//        this.y=y;
//    }
//}
//class BCG {
//    int n[];
//
//    BCG(int h) {
//        n = new int[h];
//        for (int i = 0; i < h; i++) {
//            n[i] = i;
//        }
//    }
//
//    void add(int a, int b) {
//        if (f(a) == f(b)) return;
//        n[f(b)] = f(a);
//    }
//
//    int f(int x) {
//        if (n[x] == x) return x;
//        else return n[x] = f(n[x]);
//    }
//}
//class edge{
//    public edge(int start, int end, int val) {
//        this.start = start;
//        this.end = end;
//        this.val = val;
//    }
//
//    int start;
//       int end;
//       int val;
//}
//class Solution {
//    Map<Integer,Integer> m=new HashMap<>();
//    public int pseudoPalindromicPaths (TreeNode root) {
//        dfs(root);
//        return sum;
//    }
//    int sum=0;
//    void dfs(TreeNode root){
//        if(root==null)return;
//        m.put(root.val,m.getOrDefault(root.val,0)+1);
//        if(root.left==null&&root.right==null){
//            int t=0;
//            for(int i:m.keySet()){
//                if(m.get(i)%2==1)t++;
//            }
//            if(t<=1)sum++;
//        }
//        dfs(root.left);
//        dfs(root.right);
//        if(m.get(root.val)==1)m.remove(root.val);
//        else m.put(root.val,m.get(root.val)-1);
//
//    }
//}