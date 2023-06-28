package assignment.customer.rewards.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Customer {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    @Column(name = "name")
	private String name;

    @Column(name = "purchase_cost")
	private Integer cost;

    @Column(name = "purchase_month")
	private Integer month;
}
