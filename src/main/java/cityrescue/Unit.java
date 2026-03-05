package cityrescue;

import cityrescue.enums.*;

abstract class Unit {

    // There is no default type, so leave this
    // empty 
    UnitType unit_type;

    // Units are IDLE by default
    UnitStatus unit_status = UnitStatus.IDLE;

    // Time it takes for a type of unit to resolve
    // a scene
    int TICKSATSCENE;

    // ID representing the given unit
    int unitId;

    abstract boolean canHandle(IncidentType type);
    abstract int getTicksToResolve(int severity);
    

}

class Ambulance extends Unit {

    UnitType unit_type = UnitType.AMBULANCE;
    final int TICKSATSCENE = 2;


    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.MEDICAL;
    }

    @Override
    int getTicksToResolve(int severity) {
        // TODO Auto-generated method stub
        return 0;
    }    

}

class PoliceCar extends Unit {

    UnitType unit_type = UnitType.POLICE_CAR;
    final int TICKSATSCENE = 3;


    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.CRIME;
    }

    @Override
    int getTicksToResolve(int severity) {
        // TODO Auto-generated method stub
        return 0;
    }    

}

class FireEngine extends Unit {

    UnitType unit_type = UnitType.FIRE_ENGINE;
    final int TICKSATSCENE = 4;


    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.FIRE;
    }

    @Override
    int getTicksToResolve(int severity) {
        // TODO Auto-generated method stub
        return 0;
    }    

}