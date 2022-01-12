  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s0 p2;
    std::vector<s0> p3;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1, s0 v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s6 {
    s2 p0;
    s0 p1;
    s6(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f68(const double &v0) {
    const double v5 = v0 * v0;
    double v2 = v5;
    v2 = v5;
    double v7 = v2;
    double v4 = v7;
    double v1 = v5;
    double v3 = v0;
    double v6 = v2;
    double v8 = v6;
    const double v14 = v8 - v3;
    double v11 = v1;
    v6 = v11;
    double v19 = v14;
    double v15 = v4;
    double v16 = v15;
    const std::vector<double> v9 { v11, v19, v15, v4 };
    const double v21 = v9[0];
    const double v52 = v16 + v21;
    return v52;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    double v11 = v1;
    const double v26 = f68(v11);
    return v26;
  }
  int main() {
    s6 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } }, { { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { { 48.0 }, { 49.0 } }, { { 50.0 } } } } }, { { { 51.0 }, { 52.0 } }, { { 53.0 } } } });
    double v1(54.0);
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
