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
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f5(const s1 &v0) {
    const std::vector<s0> v1 = v0.p1;
    const s0 v2 = v1[1];
    const std::vector<s0> v17 = v0.p1;
    const s1 v21(v2, v17);
    return v21;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s1 &v1, const std::vector<s2> &v2, const double &v3) {
    const std::vector<s0> v7 = v1.p1;
    const s0 v5 = v7[0];
    const std::vector<std::vector<double>> v9 = v5.p1;
    const std::vector<double> v11 = v9[1];
    const s1 v13 = f5(v1);
    std::vector<double> v8 = v11;
    const s0 v17 = v13.p0;
    v8 = v11;
    const std::vector<std::vector<double>> v23 = v17.p1;
    v8[0] = v3;
    const std::vector<std::vector<double>> v47 = v5.p0;
    const std::vector<double> v31 = v23[0];
    const std::vector<std::vector<double>> v21 = v5.p0;
    std::vector<std::vector<double>> v29 = v21;
    std::vector<std::vector<double>> v51 = v47;
    const double v44 = v31[0];
    const std::vector<double> v58 = v29[0];
    v8[0] = v3;
    v29 = v51;
    const double v55 = v58[0];
    v8[0] = v44;
    const std::vector<double> v120 = v51[0];
    v29[0] = v8;
    v29[0] = v11;
    std::vector<double> v73 = v11;
    v51[0] = v73;
    const double v53 = v55 - v3;
    const double v123 = v3 - v53;
    v51[0] = v120;
    v29[0] = v11;
    return v123;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } }, { { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } });
    s1 v1({ { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } });
    std::vector<s2> v2({ { { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } } }, { { { { 51.0 } }, { { 52.0 }, { 53.0 } } } } }, { { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } }, { { { { { { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } } } }, { { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } }, { { { { 66.0 } }, { { 67.0 }, { 68.0 } } } } } });
    double v3(69.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
