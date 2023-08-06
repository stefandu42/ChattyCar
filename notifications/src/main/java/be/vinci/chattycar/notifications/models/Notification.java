package be.vinci.chattycar.notifications.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "notifications")
public class Notification {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("notification_id")
  @Column(name = "notification_id")
  private int notificationId;
  @JsonProperty("user_id")
  @Column(name = "user_id")
  private int userId;
  @JsonProperty("trip_id")
  @Column(name = "trip_id")
  private int tripId;
  private LocalDate date;
  @JsonProperty("notification_text")
  @Column(name = "notification_text")
  private String notificationText;

}
