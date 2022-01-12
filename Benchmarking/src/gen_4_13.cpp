  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    std::vector<std::vector<s0>> p2;
    s1(std::vector<s0> v0, s0 v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    double v4 = v1;
    double v23 = v1;
    const double v20 = v4 / v23;
    const double v81 = v4 + v23;
    double v47 = v81;
    double v77 = v4;
    double v62 = v77;
    const std::vector<double> v78 { v23, v23, v62, v20, v1, v77, v47 };
    const std::vector<std::vector<double>> v150 { v78, v78, v78, v78, v78, v78, v78 };
    const std::vector<double> v142 = v150[5];
    const double v163 = v142[0];
    return v163;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 }, { 1.0 } } }, { { { { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } } }, { { { { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } } } } } } }, { { { { 14.0 }, { 15.0 } } }, { { { { { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } } } }, { { { 22.0 }, { 23.0 } } }, { { { { { 24.0 }, { 25.0 } } } }, { { { { 26.0 }, { 27.0 } } } } } } }, { { { { 28.0 }, { 29.0 } } }, { { { { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } } }, { { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } } }, { { { { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 } } } } } } } });
    double v1(42.0);
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
