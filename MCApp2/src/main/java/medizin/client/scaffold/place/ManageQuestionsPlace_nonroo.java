package medizin.client.scaffold.place;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;
import com.google.gwt.user.client.Window;



/**
 * A place in the app that deals with a specific {@link RequestFactory} proxy.
 */
public class ManageQuestionsPlace_nonroo extends Place {
	/**
	 * The things you do with a record, each of which is a different bookmarkable
	 * location in the scaffold app.
	 */
	public enum Operation {
		CREATE, EDIT, DETAILS
	}

	/**
	 * Tokenizer.
	 */
	@Prefix("r")
	public static class Tokenizer implements PlaceTokenizer<ManageQuestionsPlace_nonroo> {
		/**
		 *
		 */
		private static final String SEPARATOR = "!";
		private final RequestFactory requests;

		public Tokenizer(RequestFactory requests) {
			this.requests = requests;
		}

		public ManageQuestionsPlace_nonroo getPlace(String token) {
			String bits[] = token.split(SEPARATOR);
			Operation operation = Operation.valueOf(bits[1]);
			if (Operation.CREATE == operation) {
				return new ManageQuestionsPlace_nonroo(requests.getProxyClass(bits[0]));
			}
			return new ManageQuestionsPlace_nonroo(requests.getProxyId(bits[0]), operation);
		}

		public String getToken(ManageQuestionsPlace_nonroo place) {
			if (Operation.CREATE == place.getOperation()) {
				return requests.getHistoryToken(place.getProxyClass()) + SEPARATOR
						+ place.getOperation();
			}
			return requests.getHistoryToken(place.getProxyId()) + SEPARATOR
					+ place.getOperation();
		}
	}

	private final EntityProxyId<?> proxyId;
	private final Class<? extends EntityProxy> proxyClass;
	private final Operation operation;

	public ManageQuestionsPlace_nonroo(Class<? extends EntityProxy> proxyClass) {
		Window.alert("PlaceChange");
		

		this.operation = Operation.CREATE;
		this.proxyId = null;
		this.proxyClass = proxyClass;
	}

	public ManageQuestionsPlace_nonroo(EntityProxyId<?> record) {
		this(record, Operation.DETAILS);
	}

	public ManageQuestionsPlace_nonroo(EntityProxyId<?> proxyId, Operation operation) {
		this.operation = operation;
		this.proxyId = proxyId;
		this.proxyClass = null;
		assert Operation.CREATE != operation;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ManageQuestionsPlace_nonroo other = (ManageQuestionsPlace_nonroo) obj;
		if (operation != other.operation) {
			return false;
		}
		if (proxyClass == null) {
			if (other.proxyClass != null) {
				return false;
			}
		} else if (!proxyClass.equals(other.proxyClass)) {
			return false;
		}
		if (proxyId == null) {
			if (other.proxyId != null) {
				return false;
			}
		} else if (!proxyId.equals(other.proxyId)) {
			return false;
		}
		return true;
	}

	public Operation getOperation() {
		return operation;
	}

	public Class<? extends EntityProxy> getProxyClass() {
		return proxyId != null ? proxyId.getProxyClass() : proxyClass;
	}

	/**
	 * @return the proxyId, or null if the operation is {@link Operation#CREATE}
	 */
	public EntityProxyId<?> getProxyId() {
		return proxyId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		result = prime * result
				+ ((proxyClass == null) ? 0 : proxyClass.hashCode());
		result = prime * result + ((proxyId == null) ? 0 : proxyId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ProxyPlace [operation=" + operation + ", proxy=" + proxyId
				+ ", proxyClass=" + proxyClass + "]";
	}
}
