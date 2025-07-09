package br.peerplay.domain.core;

public interface PersistableRepository<T> {

    <S extends T> S save(S entity);

    <S extends T> Iterable<S> saveAll(Iterable<S> entities);

}