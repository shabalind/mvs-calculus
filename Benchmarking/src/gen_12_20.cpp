  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const std::vector<s1> &v1, const s0 &v2, const std::vector<s1> &v3, const double &v4, const s1 &v5) {
    const std::vector<std::vector<s0>> v11 = v5.p1;
    const std::vector<s0> v18 = v11[1];
    const std::vector<std::vector<double>> v21 = v2.p1;
    double v27 = v4;
    const s0 v25 = v18[0];
    const std::vector<double> v29 = v21[0];
    const std::vector<std::vector<double>> v33 = v25.p0;
    std::vector<std::vector<double>> v46 = v33;
    const std::vector<double> v38 = v46[0];
    v46[0] = v29;
    std::vector<double> v104 = v38;
    const double v233 = v104[0];
    v104[0] = v27;
    return v233;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } } } } } } });
    std::vector<s1> v1({ { { { { { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 } }, { { 13.0 } } } }, { { { { 14.0 } }, { { 15.0 } } } } } } });
    s0 v2({ { { 16.0 } }, { { 17.0 } } });
    std::vector<s1> v3({ { { { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } } }, { { { { { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 } } } } } }, { { { { { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 } } } } }, { { { { { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 } } } } } }, { { { { { { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 } } } } }, { { { { { 38.0 } }, { { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 } } } } } } });
    double v4(42.0);
    s1 v5({ { { { { { 43.0 } }, { { 44.0 } } } }, { { { { 45.0 } }, { { 46.0 } } } } }, { { { { { 47.0 } }, { { 48.0 } } } }, { { { { 49.0 } }, { { 50.0 } } } } } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
