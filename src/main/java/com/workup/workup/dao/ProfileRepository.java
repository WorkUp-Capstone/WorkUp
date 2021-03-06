package com.workup.workup.dao;

import com.workup.workup.models.Profile;
import com.workup.workup.models.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProfileRepository extends JpaRepository<Profile, Long> {
  Profile findById(long id);

  Profile getProfileByUserIs(User user);

  // NO LONGER NEEDED FOR HOME VIEWS
  //    List<Profile> getAllByUserRole_Id(Long id);

  Profile getProfileByUserId(long id);

  @Query(
      value =
          "SELECT Distinct profiles.id FROM profiles"
              + "   LEFT JOIN profile_categories ON profiles.id = profile_categories.profile_id"
              + "    LEFT JOIN categories ON profile_categories.category_id = categories.id"
              + "    JOIN users ON profiles.user_id = users.id"
              + "    WHERE "
              + "  (Match(city, state) AGAINST (?1)) OR"
              + "  (Match(name) AGAINST (?1)) OR"
              + "  (Match(first_name, last_name) AGAINST (?1))",
      nativeQuery = true)
  List<Long> devSearch(String searchString);

  @NotNull
  List<Profile> findAll();

  List<Profile> getAllByUserRole_Id(long id);

  @Query(
      value =
          "from Profile p left join Category c on p.id = c.id left join User u on p.id = u.id "
              + "where p.about like %:keyword% or p.city like %:keyword% or p.state like %:keyword% or p.phone_number like %:keyword% or u.first_name like %:keyword% or u.last_name like %:keyword% or u.email like %:keyword% or c.name like %:keyword%")
  List<Profile> getProfilesByKeyword(@Param("keyword") String keyword);
}