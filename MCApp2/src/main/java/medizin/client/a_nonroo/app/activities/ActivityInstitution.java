package medizin.client.a_nonroo.app.activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.InstitutionView;
import medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceInstitution;
import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.InstitutionRequest;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class ActivityInstitution extends AbstractActivityWrapper implements
		InstitutionView.Presenter, InstitutionView.Delegate {

	private PlaceInstitution institutionPlace;

	private AcceptsOneWidget widget;
	private InstitutionView view;

	private SingleSelectionModel<InstitutionProxy> selectionModel;

	private HandlerRegistration rangeChangeHandler;

	private final Map<EntityProxyId<InstitutionProxy>, Integer> idToRow = new HashMap<EntityProxyId<InstitutionProxy>, Integer>();
	private final Map<EntityProxyId<InstitutionProxy>, InstitutionProxy> idToProxy = new HashMap<EntityProxyId<InstitutionProxy>, InstitutionProxy>();
	private Boolean pendingSelection;
	private ActivityManager activityManger;
	private ActivityInstitutionMapper activityInstitutionMapper;


	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityInstitution(PlaceInstitution place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.institutionPlace = place;
        this.requests = requests;
        this.placeController = placeController;
		this.activityInstitutionMapper = new ActivityInstitutionMapper(
				requests, placeController);
		this.activityManger = new ActivityManager(activityInstitutionMapper,
				requests.getEventBus());
	}

	@Override
	public String mayStop() {

		// activityManger.setDisplay(null);
		return null;
	}

	@Override
	public void onCancel() {
		onStop();

	}

	@Override
	public void onStop() {
		// ((SlidingPanel)widget).remove(view.asWidget());
		Log.info("ActivityInstitution stops...");
		activityManger.setDisplay(null);

		Log.info("ActivityManger auf null gestezt");

	}

	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	
	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		Log.info("Activity Institution start");
		InstitutionView institutionView = new InstitutionViewImpl();
		institutionView.setName("hallo");
		institutionView.setPresenter(this);
		this.widget = widget;
		this.view = institutionView;
		widget.setWidget(institutionView.asWidget());
		setTable(view.getTable());

		eventBus.addHandler(PlaceChangeEvent.TYPE,
				new PlaceChangeEvent.Handler() {
					public void onPlaceChange(PlaceChangeEvent event) {
						// updateSelection(event.getNewPlace());
						// TODO implement
					}
				});
		init();

		activityManger.setDisplay(view.getDetailsPanel());

		// Inherit the view's key provider
		ProvidesKey<InstitutionProxy> keyProvider = ((AbstractHasData<InstitutionProxy>) table)
				.getKeyProvider();
		selectionModel = new SingleSelectionModel<InstitutionProxy>(keyProvider);
		table.setSelectionModel(selectionModel);

		selectionModel
				.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
					public void onSelectionChange(SelectionChangeEvent event) {
						InstitutionProxy selectedObject = selectionModel
								.getSelectedObject();
						if (selectedObject != null) {
							Log.debug(selectedObject.getInstitutionName()
									+ " selected!");
							showDetails(selectedObject);
						}
					}
				});

		view.setDelegate(this);
		// updateSelection(mcAppFactory.getPlaceController().getWhere());

	}

	protected void showDetails(InstitutionProxy institution) {
		Log.debug("Institution Stable id: " + institution.stableId() + " "
				+ PlaceInstitutionEvent.Operation.DETAILS);
		placeController.goTo(
				new PlaceInstitutionEvent(institution.stableId(),
						PlaceInstitutionEvent.Operation.DETAILS));
	}

	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
	}

	protected Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> createRangeRequest(
			Range range) {
		return requests.institutionRequest()
				.findInstitutionEntries(range.getStart(), range.getLength());
	}

	protected void fireCountRequest(Receiver<Long> callback) {
		requests.institutionRequest()
				.countInstitutions().fire(callback);
	}

	private void init() {

		fireCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Intitution aus der Datenbank: " + response);
				view.getTable().setRowCount(response.intValue(), true);

				onRangeChanged();
			}

		});

		rangeChangeHandler = table
				.addRangeChangeHandler(new RangeChangeEvent.Handler() {
					public void onRangeChange(RangeChangeEvent event) {
						ActivityInstitution.this.onRangeChanged();
					}
				});
	}

	private CellTable<InstitutionProxy> table;

	public CellTable<InstitutionProxy> getTable() {
		return table;
	}

	public void setTable(CellTable<InstitutionProxy> table) {
		this.table = table;
	}

	protected void onRangeChanged() {
		final Range range = table.getVisibleRange();

		final Receiver<List<InstitutionProxy>> callback = new Receiver<List<InstitutionProxy>>() {
			@Override
			public void onSuccess(List<InstitutionProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				idToRow.clear();
				idToProxy.clear();
				for (int i = 0, row = range.getStart(); i < values.size(); i++, row++) {
					InstitutionProxy institution = values.get(i);
					@SuppressWarnings("unchecked")
					// Why is this cast needed?
					EntityProxyId<InstitutionProxy> proxyId = (EntityProxyId<InstitutionProxy>) institution
							.stableId();
					idToRow.put(proxyId, row);
					idToProxy.put(proxyId, institution);
				}
				table.setRowData(range.getStart(), values);

				// finishPendingSelection();
				if (widget != null) {
					widget.setWidget(view.asWidget());
				}
			}
		};

		fireRangeRequest(range, callback);

	}

	private void getLastPage() {
		fireCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				int rows = response.intValue();
				table.setRowCount(rows, true);
				if (rows > 0) {
					int pageSize = table.getVisibleRange().getLength();
					int remnant = rows % pageSize;
					if (remnant == 0) {
						table.setVisibleRange(rows - pageSize, pageSize);
					} else {
						table.setVisibleRange(rows - remnant, pageSize);
					}
				}
				onRangeChanged();
			}
		});
	}

	private void fireRangeRequest(final Range range,
			final Receiver<List<InstitutionProxy>> callback) {
		createRangeRequest(range).with(view.getPaths()).fire(callback);
		// Log.debug(((String[])view.getPaths().toArray()).toString());
	}

	/**
	 * Finish selecting a proxy that hadn't yet arrived when
	 * {@link #select(EntityProxyId)} was called.
	 */
	private void finishPendingSelection() {
		if (pendingSelection != null) {
			InstitutionProxy selectMe = idToProxy.get(pendingSelection);
			pendingSelection = null;
			if (selectMe != null) {
				// TODO make selection Model
				selectionModel.setSelected(selectMe, true);
			}
		}
	}

	@Override
	public void deleteClicked(InstitutionProxy institution) {

		requests.institutionRequest().remove()
				.using(institution).fire(new Receiver<Void>() {

					public void onSuccess(Void ignore) {
						Log.debug("Sucessfull deleted");
						init();

					}

					@Override
					public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE
								+ " in Institution -" + error.getMessage());
						if (error.getMessage().contains(
								"ConstraintViolationException")) {
							Log.debug("Fehlen beim erstellen: Doppelter name");
							//TODO mcAppFactory.getErrorPanel().setErrorMessage(cAppConstant.INSTITUTION_IS_REFERENCED);
						}

					}

					@Override
					public void onViolation(Set<Violation> errors) {
						Iterator<Violation> iter = errors.iterator();
						String message = "";
						while (iter.hasNext()) {
							message += iter.next().getMessage() + "<br>";
						}
						Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
								+ " in Institution -" + message);

						//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);

					}

				});

	}

	@Override
	public void editClicked() {
		// TODO Auto-generated method stub

	}

	@Override
	public void newClicked(String institutionName) {
		Log.debug("new Institution Clicked");
		InstitutionRequest request = requests.institutionRequest();
		InstitutionProxy institution = request.create(InstitutionProxy.class);
		institution.setInstitutionName(institutionName);
		institution.setVersion(0);

		request.persist().using(institution).fire(new Receiver<Void>() {

			public void onSuccess(Void ignore) {
				Log.debug("Sucessfull created");
				getLastPage();

			}

			@Override
			public void onFailure(ServerFailure error) {
				Log.warn(McAppConstant.ERROR_WHILE_CREATE + " in Institution -"
						+ error.getMessage());
				if (error.getMessage().contains("ConstraintViolationException")) {
					Log.debug("Fehlen beim erstellen: Doppelter name");
					//TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.CONTENT_NOT_UNIQUE);
				}

			}

			@Override
			public void onViolation(Set<Violation> errors) {
				Log.debug("Fehlen beim erstellen, volation: "
						+ errors.toString());
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while (iter.hasNext()) {
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_CREATE_VIOLATION
						+ " in Institution -" + message);

				//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);

			}

		});
	}
}
