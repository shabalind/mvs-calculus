  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    std::vector<std::vector<s1>> p2;
    std::vector<s1> p3;
    std::vector<std::vector<s0>> p4;
    s0 p5;
    s2(std::vector<s0> v0, s0 v1, std::vector<std::vector<s1>> v2, std::vector<s1> v3, std::vector<std::vector<s0>> v4, s0 v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s2> p1;
    s5(s0 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s5 p1;
    s6(s1 v0, s5 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    const s1 v2 = v0.p0;
    const s0 v12 = v2.p0;
    const s3 v13(v12, v12);
    const s0 v14 = v13.p1;
    s0 v22 = v14;
    const std::vector<std::vector<double>> v10 = v22.p1;
    const std::vector<double> v25 = v10[0];
    const double v63 = v25[0];
    std::vector<double> v39 = v25;
    const double v27 = v39[0];
    v39[0] = v63;
    return v27;
  }
  int main() {
    s6 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } } }, { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { { 39.0 }, { 40.0 } }, { { 41.0 } } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } }, { { { { 48.0 }, { 49.0 } }, { { 50.0 } } }, { { { { 51.0 }, { 52.0 } }, { { 53.0 } } } } } }, { { { { { 54.0 }, { 55.0 } }, { { 56.0 } } } }, { { { { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 } } } } }, { { { 63.0 }, { 64.0 } }, { { 65.0 } } } } } } });
    double v1(66.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
