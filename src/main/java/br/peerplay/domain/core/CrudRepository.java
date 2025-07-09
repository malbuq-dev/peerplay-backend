package br.peerplay.domain.core;

public interface CrudRepository<T, ID>
        extends ReadableRepository<T, ID>, PersistableRepository<T>,
        RemovableRepository<T, ID> {}
