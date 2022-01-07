#include "Random.h"
#include "Benchmark.h"
#include <cmath>
#include <cstdio>
#include <vector>

struct Ball {
  int x;
  int y;
  int xVel;
  int yVel;
};

Ball randomized(Random &random) {
  Ball ball;
  ball.x = random.next() % 500;
  ball.y = random.next() % 500;
  ball.xVel = (random.next() % 300) - 150;
  ball.yVel = (random.next() % 300) - 150;
  return ball;
}

bool bounce(Ball &ball) {
  int xLimit = 500;
  int yLimit = 500;
  bool bounced = false;

  ball.x += ball.xVel;
  ball.y += ball.yVel;
  if (ball.x > xLimit) {
    ball.x = xLimit;
    ball.xVel = 0 - abs(ball.xVel) ; bounced = true;
  }
  if (ball.x < 0) {
    ball.x = 0;
    ball.xVel = abs(ball.xVel);
    bounced = true;
  }
  if (ball.y > yLimit) {
    ball.y = yLimit;
    ball.yVel = 0 - abs(ball.yVel);
    bounced = true;
  }
  if (ball.y < 0) {
    ball.y = 0;
    ball.yVel = abs(ball.yVel);
    bounced = true;
  }

  return bounced;
}

int run(int ballCount) {
  Random random = Random();
  int bounces   = 0;
  std::vector<Ball> balls;
  balls.reserve(ballCount);

  for (int j = 0; j < ballCount; j++) {
    balls.push_back(randomized(random));
  }

  for (int i = 0; i < 50; i++) {
    for (int j = 0; j < ballCount; j++) {
      if (bounce(balls[j])) {
        bounces += 1;
      }
    }
  }

  return bounces;
}
