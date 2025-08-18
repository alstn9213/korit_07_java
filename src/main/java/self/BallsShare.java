package self;

public class BallsShare {

        public int solution(int balls, int share) {
         int answer = 0;
         if(balls == share) return 1;
         return (int) Math.round(f(balls) / (f(balls-share) * f(share)));
        }
        private double f(int n) {
            if(n == 1) return 1;
            return n*f(n-1);
        }
    }

