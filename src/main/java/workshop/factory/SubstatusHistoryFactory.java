package workshop.factory;


import workshop.constants.Substatus;
import workshop.dto.SubstatusHistory;

import java.time.ZonedDateTime;

/**
 * Created by ncferrucci on 11/30/17.
 */
public enum SubstatusHistoryFactory {

    WAITING_FOR_WITHDRAWAL {
        @Override
        public SubstatusHistory create() {
            return this.getSubstatusHistory(Substatus.WAITING_FOR_WITHDRAWAL, ZonedDateTime.parse("2000-04-03T06:00:00Z"));
        }
    };

    public abstract SubstatusHistory create();

    protected SubstatusHistory getSubstatusHistory(Substatus substatus, ZonedDateTime dateTime) {
        return SubstatusHistory.builder()
                .withStatus(substatus.getParent().getId())
                .withSubstatus(substatus.getId())
                .withDate(dateTime)
                .build();
    }
}
