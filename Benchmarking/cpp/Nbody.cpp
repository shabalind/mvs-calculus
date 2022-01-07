#include <vector>
#include <cstdio>
#include <cmath>

struct Vec3 {
  public:
    double x;
    double y;
    double z;

    Vec3(double initX, double initY, double initZ) : x(initX), y(initY), z(initZ) { }
};

struct Body {
  public:
    Vec3 r;
    Vec3 v;
    double m;
    double d;

    Body(Vec3 initR, Vec3 initV, double initM, double initD) : r(initR), v(initV), m(initM), d(initD) { }
};

void advance(std::vector<Body> &bodies, int n, double dt) {
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      double dx = bodies[i].r.x - bodies[j].r.x;
      double dy = bodies[i].r.y - bodies[j].r.y;
      double dz = bodies[i].r.z - bodies[j].r.z;

      double dSquared  = dx * dx + dy * dy + dz * dz;
      double magnitude = dt / (dSquared * sqrt(dSquared));

      bodies[i].v.x = bodies[i].v.x - dx * bodies[j].m * magnitude;
      bodies[i].v.y = bodies[i].v.y - dy * bodies[j].m * magnitude;
      bodies[i].v.z = bodies[i].v.z - dz * bodies[j].m * magnitude;

      bodies[j].v.x = bodies[j].v.x + dx * bodies[i].m * magnitude;
      bodies[j].v.y = bodies[j].v.y + dy * bodies[i].m * magnitude;
      bodies[j].v.z = bodies[j].v.z + dz * bodies[i].m * magnitude;
    }
  }

  for (int i = 0; i < n; i++) {
    bodies[i].r.x = bodies[i].r.x + dt * bodies[i].v.x;
    bodies[i].r.y = bodies[i].r.y + dt * bodies[i].v.y;
    bodies[i].r.z = bodies[i].r.z + dt * bodies[i].v.z;
  }
} 

double energy(std::vector<Body> &bodies, int n) {
  double e = 0.0;

  for (int i = 0; i < n; i++) {
    e = e + 0.5 * bodies[i].m * (
      bodies[i].v.x * bodies[i].v.x +
      bodies[i].v.y * bodies[i].v.y +
      bodies[i].v.z * bodies[i].v.z);

    for (int j = i + 1; j < n; j++) {
      double dx = bodies[i].r.x - bodies[j].r.x;
      double dy = bodies[i].r.y - bodies[j].r.y;
      double dz = bodies[i].r.z - bodies[j].r.z;

      double distance = sqrt(dx * dx + dy * dy + dz * dz);
      e = e - (bodies[i].m * bodies[j].m) / distance;
    }
  }

  return e;
}

int run(int iterations) { 
  double pi          = 3.1415926535897931;
  int planetCount    = 5;
  double solarMass   = 4.0 * pi * pi;
  double daysPerYear = 365.24;

  Body sun(
    Vec3(0.0, 0.0, 0.0),
    Vec3(0.0, 0.0, 0.0),
    solarMass,
    0.0);

  Body jupiter(
    Vec3(4.8414314424647209, -1.16032004402742839, -0.103622044471123109),
    Vec3( 1.66007664274403694e-03 * daysPerYear,
          7.69901118419740425e-03 * daysPerYear,
         -6.90460016972063023e-05 * daysPerYear),
    9.54791938424326609e-04 * solarMass,
    0.0);

  Body saturn(
    Vec3(8.34336671824457987, 4.12479856412430479, -4.03523417114321381e-01),
    Vec3(-2.76742510726862411e-03 * daysPerYear,
          4.99852801234917238e-03 * daysPerYear,
          2.30417297573763929e-05 * daysPerYear),
    2.85885980666130812e-04 * solarMass,
    0.0);

  Body uranus(
    Vec3(1.28943695621391310e+01, -1.51111514016986312e+01, -2.23307578892655734e-01),
    Vec3( 2.96460137564761618e-03 * daysPerYear,
          2.37847173959480950e-03 * daysPerYear,
         -2.96589568540237556e-05 * daysPerYear),
    4.36624404335156298e-05 * solarMass,
    0.0);

  Body neptune(
    Vec3(1.53796971148509165e+01, -2.59193146099879641e+01, 1.79258772950371181e-01),
    Vec3( 2.68067772490389322e-03  * daysPerYear,
          1.62824170038242295e-03  * daysPerYear,
         -9.51592254519715870e-05 * daysPerYear),
    5.15138902046611451e-05 * solarMass,
    0.0);

  std::vector<Body> bodies({sun, jupiter, saturn, uranus, neptune});

  Vec3 p(0.0, 0.0, 0.0);

  for (int i = 0; i < bodies.size(); i ++) {
    p.x = p.x + bodies[i].v.x * bodies[i].m;
    p.y = p.y + bodies[i].v.y * bodies[i].m;
    p.z = p.z + bodies[i].v.z * bodies[i].m;
  }

  bodies[0].v = Vec3(
    0.0 - p.x / solarMass,
    0.0 - p.y / solarMass,
    0.0 - p.z / solarMass);

  for (int i = 0; i < iterations; i++) {
    advance(bodies, planetCount, 0.01);
  }

  return (int) (energy(bodies, planetCount) * 100000);
}

int main() {
  // -16908
  printf("%d", run(250000));
  return 0;
}
