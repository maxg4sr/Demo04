package tw.hp.demo04.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tw.hp.demo04.Service.RequestService;
import tw.hp.demo04.entity.Request;
import tw.hp.demo04.mapper.RequestMapper;

@RestController
public class RequestController {

    @Autowired
    RequestMapper requestMapper;
    @Autowired
    private RequestService requestService;

    @Autowired
    public RequestController(RequestMapper requestMapper, RequestService requestService) {
        this.requestMapper = requestMapper;
        this.requestService = requestService;
    }
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute Request request) {
        requestService.saveRequest(request);
        return "恭喜提交成功!我們將會盡快聯絡您!";
    }
}
