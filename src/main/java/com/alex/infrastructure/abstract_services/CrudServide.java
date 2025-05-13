package com.alex.infrastructure.abstract_services;

public interface CrudServide<RQ, RS,ID> {
    public RS create(RQ request);
    public RS read(ID id);
    public RS update(RQ request, ID id);
    public void deleteById(ID id);
}
