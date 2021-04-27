package facade;

public class ComputerFacade {

    private final CPU cpu_ = new CPU();
    private final Memory memory_ = new Memory();
    private final HardDrive hard_drive_ = new HardDrive();

    // Addresses are from 1 to 1000
    private long kBootAddress = 121;
    // Boot sectors are from 0 to 200
    private long kBootSector = 9;
    // Sector sizes from boot sector 0 to 59 are of size 512 bytes
    //                    and from 59 to 200 are of size 4096 bytes
    private int kSectorSize = 512;

    public void Start() {
        cpu_.Freeze();
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }
}
