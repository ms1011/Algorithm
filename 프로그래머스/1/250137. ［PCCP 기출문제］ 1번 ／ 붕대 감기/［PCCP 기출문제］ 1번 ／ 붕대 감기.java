class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 붕대감기 t * x 회복, t초 연속 붕대 감으면 y 추가 회복
        // bandage: 시전시간 / 1초당 회복량 / 추가 회복량
        // attacks: [공격시간, 피해량]
        
        int bandageTime = bandage[0];
        int healPerSec = bandage[1];
        int addHeal = bandage[2];
        int currentHealth = health;

        int recoveryTime = 0;
        int idx = 0;
        
        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if (currentHealth <= 0) {
                return -1;
            }
            
            int attackTime = attacks[idx][0];
            int damage = attacks[idx][1];
            
            // 공격을 받으면
            if (i == attackTime) {
                currentHealth -= damage;
                idx++;
                recoveryTime = 0;
                continue;
            }
            
            // 힐을 하면
            recoveryTime++;
            
            // 힐이 끝나면
            if (recoveryTime == bandageTime) {
                currentHealth += addHeal;
                recoveryTime = 0;
            }
            
            // 1초당 회복량
            if (currentHealth < health) {
                currentHealth += healPerSec;
            }
            
            // 현재 체력은 최대 체력을 넘을 수 없다
            if (currentHealth > health) {
                currentHealth = health;
            }
        }
        
        if (currentHealth <= 0) return -1;
        
        return currentHealth;
    }
}