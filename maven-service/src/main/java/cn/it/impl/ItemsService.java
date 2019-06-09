package cn.it.impl;

import cn.it.IItemsService;
import cn.it.Itcast;
import cn.it.ItmesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService implements IItemsService {
    @Autowired
    private ItmesMapper itmesMapper;
    public Itcast finditems(int id) {
        itmesMapper.finditems(id);
        return null;
    }
}
