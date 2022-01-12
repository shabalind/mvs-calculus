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
    double p1;
    s1(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s3(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s2 p0;
    s3 p1;
    s8(s2 v0, s3 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const std::vector<s1> &v1, const double &v2) {
    const s8 v8 = v0[0];
    const s3 v6 = v8.p1;
    const s1 v7 = v1[0];
    const std::vector<s1> v10 { v7, v7, v7, v7, v7 };
    const std::vector<s1> v24 = v6.p1;
    const s1 v85 = v24[0];
    const s1 v46 = v10[1];
    const double v57 = v46.p1;
    const double v44 = v57 / v57;
    const double v99 = v85.p1;
    const double v151 = v99 - v2;
    const double v141 = v151 + v44;
    return v141;
  }
  int main() {
    std::vector<s8> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, 4.0 }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } } }, 9.0 } }, { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } } }, { { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 } } }, 22.0 }, { { { { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 } } }, 27.0 } } } }, { { { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, 32.0 }, { { { { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } } }, 37.0 } }, { { { { { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 }, { 45.0 } } } }, { { { { { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, 50.0 }, { { { { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } }, 55.0 } } } } });
    std::vector<s1> v1({ { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, 60.0 } });
    double v2(61.0);
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
