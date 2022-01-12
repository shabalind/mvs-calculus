  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s0 p2;
    std::vector<s0> p3;
    s1(s0 v0, s0 v1, s0 v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s3(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    double p1;
    s4(std::vector<s3> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s4> p0;
    s7(std::vector<s4> v0): p0(v0) { }
  };
  struct s11 {
    std::vector<s7> p0;
    s0 p1;
    s11(std::vector<s7> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s7 &v0, const std::vector<s11> &v1, const double &v2) {
    const std::vector<s4> v6 = v0.p0;
    const s4 v4 = v6[0];
    std::vector<s11> v5 = v1;
    const s11 v13 = v1[0];
    const s11 v8 = v5[0];
    v5[0] = v13;
    const s0 v10 = v8.p1;
    const double v19 = v4.p1;
    const double v18 = v10.p1;
    v5[0] = v8;
    const s4 v24 = v6[0];
    const double v23 = v19 / v18;
    const double v48 = v24.p1;
    const double v124 = v19 * v48;
    const double v178 = v124 + v23;
    double v118 = v178;
    return v118;
  }
  int main() {
    s7 v0({ { { { { { { { { 0.0 } }, 1.0 }, { { { 2.0 } }, 3.0 }, { { { 4.0 } }, 5.0 }, { { { { 6.0 } }, 7.0 } } }, { { { { { 8.0 } }, 9.0 } }, { { { { 10.0 } }, 11.0 } }, { { { { 12.0 } }, 13.0 } } } } }, 14.0 } } });
    std::vector<s11> v1({ { { { { { { { { { { { 15.0 } }, 16.0 }, { { { 17.0 } }, 18.0 }, { { { 19.0 } }, 20.0 }, { { { { 21.0 } }, 22.0 } } }, { { { { { 23.0 } }, 24.0 } }, { { { { 25.0 } }, 26.0 } }, { { { { 27.0 } }, 28.0 } } } } }, 29.0 } } }, { { { { { { { { { 30.0 } }, 31.0 }, { { { 32.0 } }, 33.0 }, { { { 34.0 } }, 35.0 }, { { { { 36.0 } }, 37.0 } } }, { { { { { 38.0 } }, 39.0 } }, { { { { 40.0 } }, 41.0 } }, { { { { 42.0 } }, 43.0 } } } } }, 44.0 } } }, { { { { { { { { { 45.0 } }, 46.0 }, { { { 47.0 } }, 48.0 }, { { { 49.0 } }, 50.0 }, { { { { 51.0 } }, 52.0 } } }, { { { { { 53.0 } }, 54.0 } }, { { { { 55.0 } }, 56.0 } }, { { { { 57.0 } }, 58.0 } } } } }, 59.0 } } } }, { { { 60.0 } }, 61.0 } } });
    double v2(62.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
