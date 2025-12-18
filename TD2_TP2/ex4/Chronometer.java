package TD2_TP2.ex4;

import java.util.Date;

public class Chronometer implements ChronometreInterface {
	private final int INIT = 0;
	private final int RUNNING = 1;
	private final int STOPPED = 2;
	
	private int status;
	private ChronometerStatus statusEum;
	private long lastStartDate;
	private long lastSumDelta;
	
	public Chronometer() {
		this.raz();
	}
	
	@Override
	public void start() {
		// if (status != RUNNING) {
		if (!statusEum.equals(ChronometerStatus.RUNNING)) {
			Date date = new Date();
			this.lastStartDate = date.getTime();
			// this.status = RUNNING;
			this.statusEum = ChronometerStatus.RUNNING;
		}
	}

	@Override
	public void stop() {
		// if (this.status == RUNNING) {
		if (this.statusEum.equals(ChronometerStatus.RUNNING)) {
			this.lastSumDelta = this.lastSumDelta + new Date().getTime() - this.lastStartDate;
			// this.status = STOPPED;
			this.statusEum = ChronometerStatus.STOPPED;
		}
	}
	 
	public void throwExecption() {
		throw new RuntimeException("this is an ex...");
	}

	@Override
	public long getTime() {
		// if (this.status == STOPPED) {
		if (this.statusEum.equals(ChronometerStatus.STOPPED)) {
			return this.lastSumDelta;
		// } else if (this.status == RUNNING) {
		} else if (this.statusEum.equals(ChronometerStatus.RUNNING)) {
			return new Date().getTime() - this.lastStartDate + this.lastSumDelta;
			// start stop => 5s  lastSumDelta 5000;
			// start -> time lastStartDate time now => 3s
			// getTime() => now -> lastStartDate + lastSumDelta
 		} else {
 			// on a pas encore commancer 
 			return 0;
 		}
		
		/*
		 * solution 2
		 */
		
		/*
			if (this.status == RUNNING) {
				return new Date().getTime() - this.lastStartDate + this.lastSumDelta;
				// start stop => 5s  lastSumDelta 5000;
				// start -> time lastStartDate time now => 3s
				// getTime() => now -> lastStartDate + lastSumDelta
	 		} else {
				return this.lastSumDelta;
			} 
 		}
		 */
	}

	@Override
	public void raz() {
		// this.status = INIT;
		this.lastStartDate = 0;
		this.lastSumDelta = 0;
		this.statusEum = ChronometerStatus.INIT;
	}

	
}
