package tw.hp.demo04.Service;

import org.springframework.stereotype.Service;
import tw.hp.demo04.entity.Request;
import tw.hp.demo04.mapper.RequestMapper;

@Service
public class RequestService {

    private final RequestMapper requestMapper;

    public RequestService(RequestMapper requestMapper) {
        this.requestMapper = requestMapper;
    }

    public void saveRequest(Request request) {
        requestMapper.insertRequest(request);
    }
}