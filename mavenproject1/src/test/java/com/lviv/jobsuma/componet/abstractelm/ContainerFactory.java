package com.lviv.jobsuma.componet.abstractelm;


public interface ContainerFactory {
    <C extends Container> C create(Class<C> containerClass);
}
