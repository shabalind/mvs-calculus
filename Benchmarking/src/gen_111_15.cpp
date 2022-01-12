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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f87(const double &v0) {
    const double v4 = v0 + v0;
    double v1 = v4;
    const std::vector<double> v3 { v4, v4, v0, v4, v1 };
    const double v2 = v3[2];
    const double v6 = v3[0];
    double v10 = v6;
    std::vector<double> v11 = v3;
    v11[4] = v10;
    v11[0] = v1;
    v11[2] = v2;
    v1 = v4;
    const double v28 = v11[4];
    return v28;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const s0 &v2, const std::vector<s0> &v3, const double &v4) {
    double v22 = v4;
    double v32 = v4;
    const double v73 = f87(v32);
    const double v51 = v73 - v32;
    v32 = v22;
    return v51;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    s1 v1({ { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } });
    s0 v2({ { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } });
    std::vector<s0> v3({ { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } });
    double v4(48.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
