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
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v5 = v0[0];
    const s0 v7 = v5.p1;
    double v10 = v1;
    v10 = v1;
    const std::vector<std::vector<double>> v12 = v7.p0;
    const std::vector<double> v19 = v12[1];
    const double v32 = v19[0];
    const double v51 = v19[0];
    const std::vector<double> v55 { v10, v32, v1, v32, v32, v51, v10 };
    std::vector<double> v62 = v55;
    const double v132 = v62[1];
    double v145 = v132;
    v62[3] = v32;
    return v145;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } });
    double v1(30.0);
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
