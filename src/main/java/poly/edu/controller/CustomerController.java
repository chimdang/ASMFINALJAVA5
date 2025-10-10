package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/index")
    public String customerIndex(Model model) {
        model.addAttribute("title", "Pine Shop - Trang chủ");
        model.addAttribute("role", "customer");
        return "customer/KH_index";
    }
    
    @GetMapping("/detailProduct")
    public String detailProduct(Model model) {
        model.addAttribute("title", "Chi tiết đơn hàng");
        model.addAttribute("role", "customer");
        return "customer/KH_detail-product";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("title", "Giỏ hàng");
        model.addAttribute("role", "customer");
        return "customer/KH_GioHang";
    }

    @GetMapping("/orders")
    public String orders(Model model) {
        model.addAttribute("title", "Đơn hàng của bạn");
        model.addAttribute("role", "customer");
        return "customer/KH_QLDonHang";
    }

    @GetMapping("/order/detail")
    public String orderDetail(Model model) {
        model.addAttribute("title", "Chi tiết đơn hàng");
        model.addAttribute("role", "customer");
        return "customer/KH_CTDonHang";
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("title", "Đặt hàng");
        model.addAttribute("role", "customer");
        return "customer/KH_DatHang";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("title", "Quản lý tài khoản");
        model.addAttribute("role", "customer");
        return "customer/KH_QLuser";
    }
}