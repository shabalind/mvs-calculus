  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const std::vector<s0> &v2, const s0 &v3, const std::vector<s0> &v4, const std::vector<s0> &v5, const std::vector<std::vector<s0>> &v6, const double &v7) {
    const std::vector<s0> v20 = v6[1];
    const std::vector<std::vector<double>> v28 = v3.p1;
    const std::vector<double> v19 = v28[0];
    const s0 v25 = v20[0];
    const std::vector<std::vector<double>> v37 = v25.p0;
    const double v33 = v19[0];
    const double v23 = v33 / v33;
    const std::vector<double> v178 = v37[1];
    const double v103 = v178[0];
    const double v46 = v103 + v23;
    return v46;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } });
    s0 v1({ { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } });
    std::vector<s0> v2({ { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } });
    s0 v3({ { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } });
    std::vector<s0> v4({ { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } });
    std::vector<s0> v5({ { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } });
    std::vector<std::vector<s0>> v6({ { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } } });
    double v7(55.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
