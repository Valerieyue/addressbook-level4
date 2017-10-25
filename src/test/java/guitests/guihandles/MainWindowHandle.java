package guitests.guihandles;

import javafx.stage.Stage;

/**
 * Provides a handle for {@code MainWindow}.
 */
public class MainWindowHandle extends StageHandle {

    private final MainMenuHandle mainMenu;
    private final CommandBoxHandle commandBox;
    private final ResultDisplayHandle resultDisplay;
    private final PersonListPanelHandle personListPanel;
    private final PersonDetailsPanelHandle personDetailsPanel;
    private final InstagramBrowserPanelHandle instagramBrowserPanel;
    private final GoogleMapBrowserPanelHandle googleMapBrowserPanel;
    private final StatusBarFooterHandle statusBarFooter;

    public MainWindowHandle(Stage stage) {
        super(stage);

        mainMenu = new MainMenuHandle(getChildNode(MainMenuHandle.MENU_BAR_ID));
        resultDisplay = new ResultDisplayHandle(getChildNode(ResultDisplayHandle.RESULT_DISPLAY_ID));
        commandBox = new CommandBoxHandle(getChildNode(CommandBoxHandle.COMMAND_INPUT_FIELD_ID));
        personListPanel = new PersonListPanelHandle(getChildNode(PersonListPanelHandle.PERSON_LIST_VIEW_ID));
        personDetailsPanel = new PersonDetailsPanelHandle(
                getChildNode(PersonDetailsPanelHandle.PERSON_DETAILS_VIEW_ID));
        instagramBrowserPanel = new InstagramBrowserPanelHandle(
                getChildNode(InstagramBrowserPanelHandle.INSTAGRAM_BROWSER_ID));
        googleMapBrowserPanel = new GoogleMapBrowserPanelHandle(
                getChildNode(GoogleMapBrowserPanelHandle.GOOGLEMAP_BROWSER_ID));
        statusBarFooter = new StatusBarFooterHandle(getChildNode(StatusBarFooterHandle.STATUS_BAR_PLACEHOLDER));
    }

    public MainMenuHandle getMainMenu() {
        return mainMenu;
    }

    public ResultDisplayHandle getResultDisplay() {
        return resultDisplay;
    }

    public CommandBoxHandle getCommandBox() {
        return commandBox;
    }

    public PersonListPanelHandle getPersonListPanel() {
        return personListPanel;
    }

    public PersonDetailsPanelHandle getPersonDetailsPanel() {
        return personDetailsPanel;
    }

    public InstagramBrowserPanelHandle getInstagramBrowserPanel() {
        return instagramBrowserPanel;
    }

    public GoogleMapBrowserPanelHandle getGoogleMapBrowserPanel() {
        return googleMapBrowserPanel;
    }

    public StatusBarFooterHandle getStatusBarFooter() {
        return statusBarFooter;
    }
}
