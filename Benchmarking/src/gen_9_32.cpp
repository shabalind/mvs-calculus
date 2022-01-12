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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const double &v2) {
    const std::vector<std::vector<s0>> v11 = v1.p1;
    const std::vector<s0> v15 = v11[1];
    const s0 v3 = v15[0];
    const s0 v10 = v15[0];
    const std::vector<std::vector<double>> v19 = v10.p0;
    const std::vector<double> v34 = v19[1];
    const double v29 = v34[0];
    const double v33 = v3.p1;
    double v39 = v29;
    const double v75 = v33 - v39;
    return v75;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, 2.0 }, { { { { { 3.0 }, { 4.0 } }, 5.0 } }, { { { { 6.0 }, { 7.0 } }, 8.0 } }, { { { { 9.0 }, { 10.0 } }, 11.0 } } } });
    s1 v1({ { { { 12.0 }, { 13.0 } }, 14.0 }, { { { { { 15.0 }, { 16.0 } }, 17.0 } }, { { { { 18.0 }, { 19.0 } }, 20.0 } }, { { { { 21.0 }, { 22.0 } }, 23.0 } } } });
    double v2(24.0);
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
