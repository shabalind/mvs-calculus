import Random

struct Ball {
  var x: Int
  var y: Int
  var xVel: Int 
  var yVel: Int
}

func randomize(ball: inout Ball, by random: inout Random) {
  ball.x = random.next() % 500
  ball.y = random.next() % 500
  ball.xVel = (random.next() % 300) - 150
  ball.yVel = (random.next() % 300) - 150
}

func bounce(ball: inout Ball) -> Bool {
  let xLimit: Int = 500
  let yLimit: Int = 500
  var bounced = false

  ball.x += ball.xVel
  ball.y += ball.yVel
  if ball.x > xLimit {
    ball.x = xLimit
    ball.xVel = 0 - abs(ball.xVel) 
    bounced = true
  }
  if ball.x < 0 { 
    ball.x = 0 
    ball.xVel = abs(ball.xVel) 
    bounced = true
  }
  if ball.y > yLimit {
    ball.y = yLimit
    ball.yVel = 0 - abs(ball.yVel)
    bounced = true
  }
  if ball.y < 0 {
    ball.y = 0
    ball.yVel = abs(ball.yVel)
    bounced = true
  }

  return bounced
}

func run(ballCount: Int) -> Int {
  var random    = Random()
  var bounces   = 0
  let zero      = Ball(x: 0, y: 0, xVel: 0, yVel: 0)
  var balls     = Array(repeating: zero, count: ballCount)

  for j in 0..<ballCount {
    randomize(ball: &balls[j], by: &random)
  }

  for _ in 0..<50 {
    for j in 0..<ballCount {
      if bounce(ball: &balls[j]) {
        bounces += 1
      }
    }
  }

  return bounces
}

// 1331
print(100)
