  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const std::vector<s0> &v2, const std::vector<std::vector<s0>> &v3, const s0 &v4, const s0 &v5, const s0 &v6, const double &v7) {
    const std::vector<std::vector<double>> v9 = v5.p0;
    std::vector<std::vector<double>> v21 = v9;
    const std::vector<double> v35 = v21[0];
    std::vector<double> v28 = v35;
    const double v64 = v28[0];
    const std::vector<std::vector<double>> v68 = v0.p3;
    const std::vector<double> v30 = v68[0];
    v21[0] = v30;
    v28[0] = v7;
    const std::vector<double> v81 = v21[0];
    v28 = v81;
    return v64;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } }, { { 2.0 } }, { { 3.0 } } });
    s0 v1({ { { 4.0 } }, { { 5.0 } }, { { 6.0 } }, { { 7.0 } } });
    std::vector<s0> v2({ { { { 8.0 } }, { { 9.0 } }, { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } }, { { 14.0 } }, { { 15.0 } } } });
    std::vector<std::vector<s0>> v3({ { { { { 16.0 } }, { { 17.0 } }, { { 18.0 } }, { { 19.0 } } } } });
    s0 v4({ { { 20.0 } }, { { 21.0 } }, { { 22.0 } }, { { 23.0 } } });
    s0 v5({ { { 24.0 } }, { { 25.0 } }, { { 26.0 } }, { { 27.0 } } });
    s0 v6({ { { 28.0 } }, { { 29.0 } }, { { 30.0 } }, { { 31.0 } } });
    double v7(32.0);
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
