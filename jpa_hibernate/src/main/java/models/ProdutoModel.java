package models;

import entities.Produto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {

  public void create(Produto p) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
    EntityManager em = emf.createEntityManager();

    try {
      System.out.println("Iniciando a transação");
      em.getTransaction().begin();
      em.persist(p);
      em.getTransaction().commit();
      System.out.println("Produto criado com sucesso !!!");
    } catch (Exception e) {
      System.err.println("Erro ao criar o produto !!! " + e.getMessage());
      if (em.getTransaction().isActive()) em.getTransaction().rollback();
    } finally {
      em.close();
      emf.close();
      System.out.println("Finalizando a transação");
    }
  }

  public void update(Produto p) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
    EntityManager em = emf.createEntityManager();
    try {
      em.getTransaction().begin();
      em.merge(p);
      em.getTransaction().commit();
      System.out.println("Produto atualizado com sucesso !!!");
    } catch (Exception e) {
      System.err.println("Erro ao atualizar o produto !!! " + e.getMessage());
      if (em.getTransaction().isActive()) em.getTransaction().rollback();
    } finally {
      em.close();
      emf.close();
    }
  }

  public void delete(Produto p) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
    EntityManager em = emf.createEntityManager();
    try {
      em.getTransaction().begin();
      Produto managed = em.contains(p) ? p : em.merge(p);
      em.remove(managed);
      em.getTransaction().commit();
      System.out.println("Produto removido com sucesso !!!");
    } catch (Exception e) {
      System.err.println("Erro ao remover o produto !!! " + e.getMessage());
      if (em.getTransaction().isActive()) em.getTransaction().rollback();
    } finally {
      em.close();
      emf.close();
    }
  }

  public Produto findById(Produto p) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
    EntityManager em = emf.createEntityManager();
    try {
      return em.find(Produto.class, p.getId());
    } finally {
      em.close();
      emf.close();
    }
  }

  public List<Produto> findAll() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
    EntityManager em = emf.createEntityManager();
    List<Produto> produtos = new ArrayList<>();
    try {
      produtos = em.createQuery("from Produto", Produto.class).getResultList();
    } finally {
      em.close();
      emf.close();
    }
    return produtos;
  }
}

