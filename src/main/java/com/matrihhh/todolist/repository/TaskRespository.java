package com.matrihhh.todolist.repository;

import com.matrihhh.todolist.model.Task;
import com.matrihhh.todolist.provider.SessionFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class TaskRespository implements JpaRepository<Task, Integer> {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Task> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Task> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Task> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Task getOne(Integer integer) {
        return null;
    }

    @Override
    public Task getById(Integer id) {
        // Crea la consulta JPQL
        String jpql = "SELECT t FROM Task t WHERE t.id = :taskId";

        // Crea la consulta TypedQuery con la consulta JPQL y el tipo de resultado
        TypedQuery<Task> query = entityManager.createQuery(jpql, Task.class);

        // Asigna el valor del parámetro al identificador de la tarea
        query.setParameter("taskId", id);

        // Ejecuta la consulta y devuelve el resultado único
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            // Maneja el caso en que no se encuentre ninguna tarea con el identificador dado
            return null;
        }
    }

    @Override
    public Task getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Task> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Task> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Task> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Task> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Task, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Task> S save(S entity) {

        entityManager.persist(entity);

        return entity;
    }

    @Override
    public <S extends Task> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Task> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Task> findAll() {
        // Crea la consulta JPQL
        String jpql = "SELECT t FROM Task t";

        // Crea la consulta TypedQuery con la consulta JPQL y el tipo de resultado
        TypedQuery<Task> query = entityManager.createQuery(jpql, Task.class);

        // Asigna el valor del parámetro al identificador de la tarea

        // Ejecuta la consulta y devuelve el resultado único
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            // Maneja el caso en que no se encuentre ninguna tarea con el identificador dado
            return null;
        }
    }

    @Override
    public List<Task> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Task entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Task> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Task> findAll(Pageable pageable) {
        return null;
    }
}
