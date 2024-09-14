package com.curso.v0;

public enum FOOD {
	
	BERRIES{ 
		@Override
		public boolean isHealthy() { return true; }
	}, 
	INSECTS{ 
		@Override
		public boolean isHealthy() { return false; }
		@Override
		boolean isSaludable() { return true; }
	},
	FISH{ 
		@Override
		public boolean isHealthy() { return true; }
		@Override
		boolean isSaludable() { return true; }
	}, 
	ROOTS{ 
		@Override
		public boolean isHealthy() { return false; }
	}, 
	COOKIES{ 
		public boolean isHealthy() { return true; }
	}, 
	HONEY{ 
		public boolean isHealthy() { return false; }
	};
	
	public abstract boolean isHealthy();
	
	boolean isSaludable() {
		return false;
	}
	
	static boolean isStatic() {
		return false;
	}
	
}
